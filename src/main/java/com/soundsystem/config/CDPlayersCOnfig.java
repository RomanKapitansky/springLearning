package com.soundsystem.config;

import com.soundsystem.components.SgtPeppers;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by rkapitansky on 12/7/2016.
 */
@Configuration
@ComponentScan("com.soundsystem.components")
//@ComponentScan(basePackages = {"com.soundsystem.components"} )
//@ComponentScan(basePackageClasses = {SgtPeppers.class})
public class CDPlayersConfig {
}