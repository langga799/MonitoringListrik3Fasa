package com.example.monitoringlistrik3phase.service.networkimport com.example.monitoringlistrik3phase.helper.Constantimport com.example.monitoringlistrik3phase.service.model.PushNotificationimport okhttp3.ResponseBodyimport retrofit2.Responseimport retrofit2.http.Bodyimport retrofit2.http.Headersimport retrofit2.http.POSTinterface NotificationAPI {    @Headers("Authorization: key=${Constant.SERVER_KEY}", "Content-Type: ${Constant.CONTENT_TYPE}")    @POST("fcm/send")    suspend fun pushNotification(        @Body notification: PushNotification    ): Response<ResponseBody>}