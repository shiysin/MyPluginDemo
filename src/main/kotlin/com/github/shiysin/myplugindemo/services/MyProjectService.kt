package com.github.shiysin.myplugindemo.services

import com.intellij.openapi.project.Project
import com.github.shiysin.myplugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
