package com.lezenford.mfr.launcher.service.runner

import com.lezenford.mfr.launcher.Launcher
import com.lezenford.mfr.launcher.config.properties.ApplicationProperties
import com.lezenford.mfr.launcher.config.properties.GameProperties
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.stereotype.Service
import kotlin.io.path.absolutePathString

@Service
@ConditionalOnProperty(name = ["application.platform"], havingValue = "LINUX")
class LinuxRunnerService(override val applicationProperties: ApplicationProperties,
    override val application: Launcher,
    private val gameProperties: GameProperties
) : RunnerService() {

    override fun startClassicGame() {
        TODO()
    }

    override fun startClassicLauncher() {
        TODO()
    }

    override fun startMge(): Process {
       TODO()
    }

    override fun startMcp() {
       TODO()
    }

    override fun startOpenMwGame() {
        Runtime.getRuntime().exec(gameProperties.openMw.application.absolutePathString())
    }

    override fun startOpenMwLauncher() {
        Runtime.getRuntime().exec(gameProperties.openMw.launcher.absolutePathString())
    }
}