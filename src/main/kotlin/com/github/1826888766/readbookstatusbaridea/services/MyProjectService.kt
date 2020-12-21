package com.github.1826888766.readbookstatusbaridea.services

import com.intellij.openapi.project.Project
import com.github.1826888766.readbookstatusbaridea.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
