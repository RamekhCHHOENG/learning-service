package com.learning_service.learning_service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;

@SpringBootApplication
public class LearningServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner printApplicationBanner(DataSource dataSource) {
		return args -> {
			System.out.println("\n");
			System.out.println("    ██╗     ███████╗ █████╗ ██████╗ ███╗   ██╗██╗███╗   ██╗ ██████╗     ███████╗███████╗██████╗ ██╗   ██╗██╗ ██████╗███████╗");
			System.out.println("    ██║     ██╔════╝██╔══██╗██╔══██╗████╗  ██║██║████╗  ██║██╔════╝     ██╔════╝██╔════╝██╔══██╗██║   ██║██║██╔════╝██╔════╝");
			System.out.println("    ██║     █████╗  ███████║██████╔╝██╔██╗ ██║██║██╔██╗ ██║██║  ███╗    ███████╗█████╗  ██████╔╝██║   ██║██║██║     █████╗  ");
			System.out.println("    ██║     ██╔══╝  ██╔══██║██╔══██╗██║╚██╗██║██║██║╚██╗██║██║   ██║    ╚════██║██╔══╝  ██╔══██╗╚██╗ ██╔╝██║██║     ██╔══╝  ");
			System.out.println("    ███████╗███████╗██║  ██║██║  ██║██║ ╚████║██║██║ ╚████║╚██████╔╝    ███████║███████╗██║  ██║ ╚████╔╝ ██║╚██████╗███████╗");
			System.out.println("    ╚══════╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝╚═╝  ╚═══╝ ╚═════╝     ╚══════╝╚══════╝╚═╝  ╚═╝  ╚═══╝  ╚═╝ ╚═════╝╚══════╝");
			System.out.println("");
			System.out.println("    ═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════");
			System.out.println("    ◆  Learning Service - Your Gateway to Knowledge  ◆");
			System.out.println("");
			System.out.println("    ✓ Application Status   : 🟢 RUNNING");
			System.out.println("    ✓ Environment          : Development");
			System.out.println("    ✓ Spring Boot Version  : 4.0.1");
			System.out.println("");
			
			// Database connection check
			try (Connection conn = dataSource.getConnection()) {
				DatabaseMetaData metaData = conn.getMetaData();
				String dbStatus = conn.isValid(5) ? "🟢 CONNECTED" : "🔴 DISCONNECTED";
				
				System.out.println("    ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
				System.out.println("    📊 DATABASE CONNECTION STATUS");
				System.out.println("    ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
				System.out.println("    ✓ Status               : " + dbStatus);
				System.out.println("    ✓ Database Type        : " + metaData.getDatabaseProductName());
				System.out.println("    ✓ Database Version     : " + metaData.getDatabaseProductVersion());
				System.out.println("    ✓ Driver Name          : " + metaData.getDriverName());
				System.out.println("    ✓ Driver Version       : " + metaData.getDriverVersion());
				System.out.println("    ✓ Connection URL       : " + metaData.getURL());
				System.out.println("    ✓ Database User        : " + metaData.getUserName());
				System.out.println("    ✓ Catalog              : " + conn.getCatalog());
				System.out.println("    ✓ Schema               : " + conn.getSchema());
				System.out.println("    ✓ Auto Commit          : " + (conn.getAutoCommit() ? "Enabled" : "Disabled"));
				System.out.println("    ✓ Read Only            : " + (conn.isReadOnly() ? "Yes" : "No"));
				System.out.println("    ✓ Isolation Level      : " + getTransactionIsolationName(conn.getTransactionIsolation()));
				System.out.println("    ═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════");
				System.out.println("");
				System.out.println("    💡 Ready to empower your learning journey!");
			} catch (Exception e) {
				System.out.println("    ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
				System.out.println("    📊 DATABASE CONNECTION STATUS");
				System.out.println("    ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
				System.out.println("    ✗ Status               : 🔴 FAILED");
				System.out.println("    ✗ Error                : " + e.getMessage());
				System.out.println("    ═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════");
			}
			
			System.out.println("\n");
		};
	}
	
	private String getTransactionIsolationName(int level) {
		return switch (level) {
			case Connection.TRANSACTION_NONE -> "NONE";
			case Connection.TRANSACTION_READ_UNCOMMITTED -> "READ_UNCOMMITTED";
			case Connection.TRANSACTION_READ_COMMITTED -> "READ_COMMITTED";
			case Connection.TRANSACTION_REPEATABLE_READ -> "REPEATABLE_READ";
			case Connection.TRANSACTION_SERIALIZABLE -> "SERIALIZABLE";
			default -> "UNKNOWN";
		};
	}

}
