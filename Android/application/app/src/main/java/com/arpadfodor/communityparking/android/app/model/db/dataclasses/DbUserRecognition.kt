package com.arpadfodor.communityparking.android.app.model.db.dataclasses

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.arpadfodor.communityparking.android.app.model.DateHandler
import com.arpadfodor.communityparking.android.app.model.db.ApplicationDB
import java.io.Serializable

@Entity(tableName = ApplicationDB.USER_RECOGNITION_TABLE_NAME)
data class DbUserRecognition(
    //as an Integer, it is autogenerated
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val Id: Integer? = null,
    @ColumnInfo(name = "reporter")
    val reporterEmail: String = "",
    @ColumnInfo(name = "latitude")
    val latitude: Double = 0.0,
    @ColumnInfo(name = "longitude")
    val longitude: Double = 0.0,
    @ColumnInfo(name = "timestamp_utc")
    val timestampUTC: String = DateHandler.dateToString(DateHandler.defaultDate()),
    @ColumnInfo(name = "message")
    val message: String = "",
    @ColumnInfo(name = "is_reserved")
    val isReserved: Boolean = false,
    @ColumnInfo(name = "fee_per_hour")
    val feePerHour: Int = 0,
    @ColumnInfo(name = "image_path")
    var imagePath: String? = null,
    @ColumnInfo(name = "is_sent")
    var isSent: Boolean = false
) : Serializable