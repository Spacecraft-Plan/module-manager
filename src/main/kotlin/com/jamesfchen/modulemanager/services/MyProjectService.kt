package com.jamesfchen.modulemanager.services

import com.jamesfchen.modulemanager.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
