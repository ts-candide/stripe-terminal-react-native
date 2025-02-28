package com.stripeterminalreactnative

enum class ReactNativeConstants(val listenerName: String) {
    CHANGE_CONNECTION_STATUS("didChangeConnectionStatus"),
    CHANGE_PAYMENT_STATUS("didChangePaymentStatus"),
    FETCH_TOKEN_PROVIDER("onFetchTokenProviderListener"),
    FINISH_DISCOVERING_READERS("didFinishDiscoveringReaders"),
    FINISH_INSTALLING_UPDATE("didFinishInstallingUpdate"),
    REQUEST_READER_DISPLAY_MESSAGE("didRequestReaderDisplayMessage"),
    REQUEST_READER_INPUT("didRequestReaderInput"),
    REPORT_AVAILABLE_UPDATE("didReportAvailableUpdate"),
    REPORT_UNEXPECTED_READER_DISCONNECT("didReportUnexpectedReaderDisconnect"),
    REPORT_UPDATE_PROGRESS("didReportReaderSoftwareUpdateProgress"),
    START_INSTALLING_UPDATE("didStartInstallingUpdate"),
    UPDATE_DISCOVERED_READERS("didUpdateDiscoveredReaders"),
    START_READER_RECONNECT("didStartReaderReconnect"),
    READER_RECONNECT_SUCCEED("didSucceedReaderReconnect"),
    READER_RECONNECT_FAIL("didFailReaderReconnect"),
    CHANGE_OFFLINE_STATUS("didChangeOfflineStatus"),
    FORWARD_PAYMENT_INTENT("didForwardPaymentIntent"),
    REPORT_FORWARDING_ERROR("didReportForwardingError"),
}
