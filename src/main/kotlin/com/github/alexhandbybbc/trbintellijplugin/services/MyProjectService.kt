package com.github.alexhandbybbc.trbintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.alexhandbybbc.trbintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
