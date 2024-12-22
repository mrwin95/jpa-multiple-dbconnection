package win.ddd.jpa.config;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

//@Configuration
//@EnableJpaRepositories(
//        basePackages = "win.ddd.jpa.repository.customer",
//        entityManagerFactoryRef = "customerEntityManagerFactory",
//        transactionManagerRef = "customerTransactionManager"
//)
public class CustomerDatabaseConfig {

//    @Bean(name = "customerDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.customer", ignoreInvalidFields = true)
//    public DataSource customerDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "customerEntityManagerFactory")
//    public LocalContainerEntityManagerFactoryBean customerEntityManagerFactory(EntityManagerFactoryBuilder builder,
//                                                                               @Qualifier("customerDataSource") DataSource customerDataSource) {
//        return builder
//                .dataSource(customerDataSource)
//                .packages("win.ddd.jpa.repository.customer")
//                .persistenceUnit("customerPU")
//                .build();
//    }
//
//    @Bean(name = "customerTransactionManager")
//    public PlatformTransactionManager customerTransactionManager(@Qualifier("customerEntityManagerFactory")EntityManagerFactory customerEntityManagerFactory) {
//        return new JpaTransactionManager(customerEntityManagerFactory);
//    }
}
