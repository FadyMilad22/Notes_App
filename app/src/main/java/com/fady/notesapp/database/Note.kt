package com.fady.notesapp.database

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity("note")
class Note(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo("note_details")
    val noteDetails: String,
    @ColumnInfo("note_title")
    val noteTitle: String
) : Parcelable