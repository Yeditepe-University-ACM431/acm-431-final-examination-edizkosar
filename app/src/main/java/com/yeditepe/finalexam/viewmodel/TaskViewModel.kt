package com.yeditepe.finalexam.viewmodel

import androidx.lifecycle.ViewModel

class TaskViewModel : ViewModel() {

    // TODO 1: Create a mutable state list of Task objects
    // Initially add at least 2 tasks
    private val _tasks = mutableStateListOf(
    Task(1, "Task 1", false),
    Task(2, "Task 2", true)
)
    fun toggleTask(taskId: Int) {
        // TODO 2: Update isCompleted for the given task
    }
}
