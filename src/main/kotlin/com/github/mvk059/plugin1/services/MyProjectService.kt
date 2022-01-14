package com.github.mvk059.plugin1.services

import com.intellij.openapi.project.Project
import com.github.mvk059.plugin1.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
