package com.github.jamesfchen.modulemanager.services

import com.github.jamesfchen.modulemanager.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
