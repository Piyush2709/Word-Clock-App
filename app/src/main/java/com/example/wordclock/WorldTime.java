package com.example.wordclock;

public class WorldTime {

    public class TimeZoneResponse {
        private String dstOffset;
        private String rawOffset;
        private String status;
        private String timeZoneId;
        private String timeZoneName;

        // Getters
        public String getDstOffset() { return dstOffset; }
        public String getRawOffset() { return rawOffset; }
        public String getStatus() { return status; }
        public String getTimeZoneId() { return timeZoneId; }
        public String getTimeZoneName() { return timeZoneName; }
    }

}
