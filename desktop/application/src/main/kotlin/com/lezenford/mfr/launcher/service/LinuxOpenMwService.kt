package com.lezenford.mfr.launcher.service

import com.lezenford.mfr.launcher.config.properties.ApplicationProperties
import com.lezenford.mfr.launcher.config.properties.GameProperties
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Service
@Profile("linux")
class LinuxOpenMwService (
    private val gameProperties: GameProperties,
    private val applicationProperties: ApplicationProperties
) : OpenMwService(gameProperties, applicationProperties) {

    override fun normalize(configValue: String): String {
        return configValue.replace("\\", "/")
    }
}