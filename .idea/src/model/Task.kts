@Entity(tableName = "agenda")
data class Task(
    @ColumnInfo(name = "id") @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "titulo") var title: String,
    @ColumnInfo(name = "descricao") var desc: String,
    @ColumnInfo(name = "status") var status: Boolean,
    @ColumnInfo(name = "data_criacao") val createdAt: Long
)