@Database(entities = [Task::class])
abstract class TaskDataBase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}