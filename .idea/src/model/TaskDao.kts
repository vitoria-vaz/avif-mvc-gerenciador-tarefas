@Dao
interface TaskDao {
    @Insert
    fun insertTask(task: Task)

    @Update
    fun updateTask(task: Task)

    @Delete
    fun deleteTask(task: Task)

    @Query("SELECT * FROM task")
    fun selectTask(): List<Task>
}