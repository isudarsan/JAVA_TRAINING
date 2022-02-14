package com.java.training.log4j;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.appender.ConsoleAppender;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.builder.api.AppenderComponentBuilder;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilder;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilderFactory;
import org.apache.logging.log4j.core.config.builder.api.LayoutComponentBuilder;
import org.apache.logging.log4j.core.config.builder.api.RootLoggerComponentBuilder;
import org.apache.logging.log4j.core.config.builder.impl.BuiltConfiguration;

/**
 * Hello world!
 *
 */
public class App {

	static Logger LOG = LogManager.getLogger(App.class);

	static {
		// configureLoggingConsole();
		//configureLoggingFile();
	}

	public static void main(String args[]) {

		LOG.debug("Hello, world");
		LOG.warn("Hello, world this is WARN");
		LOG.error("Hello world, this ERROR");
		LOG.fatal("Hello world, this is FATAL");
		LOG.info("Hello world, INFO");
		LOG.trace("Hello, world TRACE");

	}

	public static void configureLoggingConsole() {
		ConfigurationBuilder<BuiltConfiguration> builder = ConfigurationBuilderFactory.newConfigurationBuilder();
		// builder.setStatusLevel(Level.DEBUG);

		builder.setConfigurationName("AppLogger");

		AppenderComponentBuilder appenderBuilder = builder.newAppender("Console", "CONSOLE").addAttribute("target",
				ConsoleAppender.Target.SYSTEM_OUT);

		appenderBuilder.add(builder.newLayout("PatternLayout").addAttribute("pattern", "%d %p %c [%t] %m%n"));

		RootLoggerComponentBuilder rootLogger = builder.newRootLogger(Level.DEBUG);
		rootLogger.add(builder.newAppenderRef("Console"));

		builder.add(appenderBuilder);
		builder.add(rootLogger);

		Configurator.reconfigure(builder.build());

	}

	public static void configureLoggingFile() {

		String fileName = "app.txt";

		ConfigurationBuilder<BuiltConfiguration> builder = ConfigurationBuilderFactory.newConfigurationBuilder();

		builder.setConfigurationName("AppLogger");

		LayoutComponentBuilder layOutBuilder = builder.newLayout("PatternLayout").addAttribute("pattern",
				"%d %p %c [%t] %m%n");

		AppenderComponentBuilder appenderBuilder = builder.newAppender("LogToFile", "File")
				.addAttribute("fileName", fileName).add(layOutBuilder);

		RootLoggerComponentBuilder rootLogger = builder.newRootLogger(Level.WARN);
		rootLogger.add(builder.newAppenderRef("LogToFile"));

		builder.add(appenderBuilder);
		builder.add(rootLogger);

		Configurator.reconfigure(builder.build());

	}

}
