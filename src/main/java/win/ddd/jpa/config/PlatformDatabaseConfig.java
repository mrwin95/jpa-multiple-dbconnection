package win.ddd.jpa.config;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@EnableJpaRepositories(
        basePackages = {"win.ddd.jpa.repository.platform", "win.ddd.jpa.repository.*"},
        entityManagerFactoryRef = "platformEntityManagerFactory",
        transactionManagerRef = "platformTransactionManager"
)
@Configuration
public class PlatformDatabaseConfig {

//    @Bean
//    public JpaVendorAdapter jpaVendorAdapter() {
//        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
//        adapter.setShowSql(true);
//        adapter.setGenerateDdl(true);
//        adapter.setDatabase(Database.POSTGRESQL); // Adjust for your database
//        return adapter;
//    }

    @Primary
    @Bean(name = "platformDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.platform", ignoreInvalidFields = true)
    public DataSource platformDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "platformEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean platformEntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("platformDataSource") DataSource platformDataSource) {
        return builder
                .dataSource(platformDataSource)
                .packages("win.ddd.jpa.repository.platform", "win.ddd.jpa.entity.employee.*")
                .persistenceUnit("platformPU")
                .build();
    }

    @Primary
    @Bean(name = "platformTransactionManager")
    public PlatformTransactionManager platformTransactionManager(
            @Qualifier("platformEntityManagerFactory") EntityManagerFactory platformEntityManagerFactory
            ){
        return new JpaTransactionManager(platformEntityManagerFactory);
    }
}
