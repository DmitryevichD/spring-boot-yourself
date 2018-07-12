package com.ironbank;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @author d.dmitrievich
 * @version 12.07.18
 */
@Data
@ConfigurationProperties("raven")
public class RavenProperties {
    List<String> where;
}
