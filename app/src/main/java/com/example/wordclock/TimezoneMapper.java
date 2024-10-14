package com.example.wordclock;

import java.util.HashMap;
import java.util.Map;

public class TimezoneMapper {

    private static final Map<String, String> cityTimezoneMap = new HashMap<>();

    static {

        cityTimezoneMap.put("mumbai", "Asia/Kolkata");
        cityTimezoneMap.put("delhi", "Asia/Kolkata");
        cityTimezoneMap.put("bangalore", "Asia/Kolkata");
        cityTimezoneMap.put("chennai", "Asia/Kolkata");
        cityTimezoneMap.put("kolkata", "Asia/Kolkata");
        cityTimezoneMap.put("hyderabad", "Asia/Kolkata");
        cityTimezoneMap.put("pune", "Asia/Kolkata");
        cityTimezoneMap.put("jaipur", "Asia/Kolkata");
        cityTimezoneMap.put("ahmedabad", "Asia/Kolkata");
        cityTimezoneMap.put("surat", "Asia/Kolkata");
        cityTimezoneMap.put("lucknow", "Asia/Kolkata");
        cityTimezoneMap.put("kanpur", "Asia/Kolkata");
        cityTimezoneMap.put("nagpur", "Asia/Kolkata");
        cityTimezoneMap.put("indore", "Asia/Kolkata");
        cityTimezoneMap.put("thane", "Asia/Kolkata");
        cityTimezoneMap.put("bhopal", "Asia/Kolkata");
        cityTimezoneMap.put("visakhapatnam", "Asia/Kolkata");
        cityTimezoneMap.put("vadodara", "Asia/Kolkata");
        cityTimezoneMap.put("nasik", "Asia/Kolkata");
        cityTimezoneMap.put("faridabad", "Asia/Kolkata");
        cityTimezoneMap.put("rajkot", "Asia/Kolkata");
        cityTimezoneMap.put("kalyan", "Asia/Kolkata");
        cityTimezoneMap.put("meerut", "Asia/Kolkata");
        cityTimezoneMap.put("ludhiana", "Asia/Kolkata");
        cityTimezoneMap.put("agra", "Asia/Kolkata");
        cityTimezoneMap.put("nashik", "Asia/Kolkata");
        cityTimezoneMap.put("jabalpur", "Asia/Kolkata");
        cityTimezoneMap.put("coimbatore", "Asia/Kolkata");
        cityTimezoneMap.put("gwalior", "Asia/Kolkata");
        cityTimezoneMap.put("warangal", "Asia/Kolkata");
        cityTimezoneMap.put("vellore", "Asia/Kolkata");
        cityTimezoneMap.put("silchar", "Asia/Kolkata");
        cityTimezoneMap.put("kolhapur", "Asia/Kolkata");
        cityTimezoneMap.put("gadhingalj", "Asia/Kolkata");
        cityTimezoneMap.put("uttur", "Asia/Kolkata");
        cityTimezoneMap.put("nool", "Asia/Kolkata");
        cityTimezoneMap.put("india", "Asia/Kolkata");
        cityTimezoneMap.put("manmad", "Asia/Kolkata");
// Delhi
        cityTimezoneMap.put("newdelhi", "Asia/Kolkata");
        cityTimezoneMap.put("new delhi", "Asia/Kolkata");

        // Jharkhand
        cityTimezoneMap.put("jharkhand", "Asia/Kolkata");
        cityTimezoneMap.put("ranchi", "Asia/Kolkata");
        cityTimezoneMap.put("jamshedpur", "Asia/Kolkata");
        // Chhattisgarh
        cityTimezoneMap.put("chhattisgarh", "Asia/Kolkata");
        cityTimezoneMap.put("raipur", "Asia/Kolkata");
// Odisha
        cityTimezoneMap.put("odisha", "Asia/Kolkata");
        cityTimezoneMap.put("bhubaneswar", "Asia/Kolkata");
        cityTimezoneMap.put("cuttack", "Asia/Kolkata");

// North-East States (Assam, Meghalaya, Manipur, etc.)
        cityTimezoneMap.put("assam", "Asia/Kolkata");
        cityTimezoneMap.put("guwahati", "Asia/Kolkata");
        cityTimezoneMap.put("meghalaya", "Asia/Kolkata");
        cityTimezoneMap.put("shillong", "Asia/Kolkata");
        cityTimezoneMap.put("manipur", "Asia/Kolkata");
        cityTimezoneMap.put("imphal", "Asia/Kolkata");

// Jammu and Kashmir
        cityTimezoneMap.put("jammu and kashmir", "Asia/Kolkata");
        cityTimezoneMap.put("srinagar", "Asia/Kolkata");
        cityTimezoneMap.put("jammu", "Asia/Kolkata");
        cityTimezoneMap.put("kashmir", "Asia/Kolkata");

// Himachal Pradesh
        cityTimezoneMap.put("himachal pradesh", "Asia/Kolkata");
        cityTimezoneMap.put("shimla", "Asia/Kolkata");
        cityTimezoneMap.put("manali", "Asia/Kolkata");
        cityTimezoneMap.put("himachalpradesh", "Asia/Kolkata");

        // Haryana
        cityTimezoneMap.put("haryana", "Asia/Kolkata");
        cityTimezoneMap.put("gurugram", "Asia/Kolkata");

// Punjab
        cityTimezoneMap.put("punjab", "Asia/Kolkata");
        cityTimezoneMap.put("chandigarh", "Asia/Kolkata");
        cityTimezoneMap.put("amritsar", "Asia/Kolkata");

        // Bihar
        cityTimezoneMap.put("bihar", "Asia/Kolkata");
        cityTimezoneMap.put("patna", "Asia/Kolkata");
        cityTimezoneMap.put("gaya", "Asia/Kolkata");

// Uttar Pradesh
        cityTimezoneMap.put("uttar pradesh", "Asia/Kolkata");
        cityTimezoneMap.put("uttarpradesh", "Asia/Kolkata");

// Madhya Pradesh
        cityTimezoneMap.put("madhya pradesh", "Asia/Kolkata");
        cityTimezoneMap.put("madhyapradesh", "Asia/Kolkata");

// West Bengal
        cityTimezoneMap.put("west bengal", "Asia/Kolkata");
        cityTimezoneMap.put("westbengal", "Asia/Kolkata");
        cityTimezoneMap.put("darjeeling", "Asia/Kolkata");

// Rajasthan
        cityTimezoneMap.put("rajasthan", "Asia/Kolkata");
        cityTimezoneMap.put("jodhpur", "Asia/Kolkata");
        cityTimezoneMap.put("udaipur", "Asia/Kolkata");

// Gujarat
        cityTimezoneMap.put("gujarat", "Asia/Kolkata");

// Telangana
        cityTimezoneMap.put("telangana", "Asia/Kolkata");

// Andhra Pradesh
        cityTimezoneMap.put("andhra pradesh", "Asia/Kolkata");
        cityTimezoneMap.put("vijayawada", "Asia/Kolkata");
        cityTimezoneMap.put("tirupati", "Asia/Kolkata");
// Kerala
        cityTimezoneMap.put("kerala", "Asia/Kolkata");
        cityTimezoneMap.put("kochi", "Asia/Kolkata");
        cityTimezoneMap.put("thiruvananthapuram", "Asia/Kolkata");
        cityTimezoneMap.put("kozhikode", "Asia/Kolkata");
        // Tamil Nadu
        cityTimezoneMap.put("tamil nadu", "Asia/Kolkata");
        cityTimezoneMap.put("tamilnadu", "Asia/Kolkata");
        cityTimezoneMap.put("madurai", "Asia/Kolkata");
// Goa
        cityTimezoneMap.put("goa", "Asia/Kolkata");
        cityTimezoneMap.put("panaji", "Asia/Kolkata");
        cityTimezoneMap.put("vasco", "Asia/Kolkata");
        cityTimezoneMap.put("margao", "Asia/Kolkata");
// Karnataka
        cityTimezoneMap.put("karnataka", "Asia/Kolkata");

        cityTimezoneMap.put("mysore", "Asia/Kolkata");
        cityTimezoneMap.put("mangalore", "Asia/Kolkata");
        cityTimezoneMap.put("hubli", "Asia/Kolkata");
// Maharashtra
        cityTimezoneMap.put("maharashtra", "Asia/Kolkata");


        cityTimezoneMap.put("new york", "America/New_York");
        cityTimezoneMap.put("newyork", "America/New_York");
        cityTimezoneMap.put("los angeles", "America/Los_Angeles");
        cityTimezoneMap.put("chicago", "America/Chicago");
        cityTimezoneMap.put("houston", "America/Chicago");
        cityTimezoneMap.put("phoenix", "America/Phoenix");
        cityTimezoneMap.put("philadelphia", "America/New_York");
        cityTimezoneMap.put("san antonio", "America/Chicago");
        cityTimezoneMap.put("san diego", "America/Los_Angeles");
        cityTimezoneMap.put("dallas", "America/Chicago");
        cityTimezoneMap.put("san jose", "America/Los_Angeles");
        cityTimezoneMap.put("austin", "America/Chicago");
        cityTimezoneMap.put("jacksonville", "America/New_York");
        cityTimezoneMap.put("san francisco", "America/Los_Angeles");
        cityTimezoneMap.put("columbus", "America/New_York");
        cityTimezoneMap.put("fort worth", "America/Chicago");
        cityTimezoneMap.put("indianapolis", "America/New_York");
        cityTimezoneMap.put("charlotte", "America/New_York");
        cityTimezoneMap.put("seattle", "America/Los_Angeles");
        cityTimezoneMap.put("denver", "America/Denver");
        cityTimezoneMap.put("washington dc", "America/New_York");
        cityTimezoneMap.put("boston", "America/New_York");
        cityTimezoneMap.put("detroit", "America/New_York");
        cityTimezoneMap.put("nashville", "America/Chicago");
        cityTimezoneMap.put("memphis", "America/Chicago");
        cityTimezoneMap.put("portland", "America/Los_Angeles");
        cityTimezoneMap.put("oklahoma city", "America/Chicago");
        cityTimezoneMap.put("las vegas", "America/Los_Angeles");
        cityTimezoneMap.put("milwaukee", "America/Chicago");
        cityTimezoneMap.put("albuquerque", "America/Denver");
        cityTimezoneMap.put("tucson", "America/Phoenix");
        cityTimezoneMap.put("fresno", "America/Los_Angeles");
        cityTimezoneMap.put("sacramento", "America/Los_Angeles");
        cityTimezoneMap.put("long beach", "America/Los_Angeles");
        cityTimezoneMap.put("kansas city", "America/Chicago");
        cityTimezoneMap.put("mesa", "America/Phoenix");
        cityTimezoneMap.put("virginia beach", "America/New_York");
        cityTimezoneMap.put("atlanta", "America/New_York");
        cityTimezoneMap.put("colorado springs", "America/Denver");
        cityTimezoneMap.put("omaha", "America/Chicago");
        cityTimezoneMap.put("raleigh", "America/New_York");
        cityTimezoneMap.put("miami", "America/New_York");
        cityTimezoneMap.put("cleveland", "America/New_York");
        cityTimezoneMap.put("tampa", "America/New_York");
        cityTimezoneMap.put("cincinnati", "America/New_York");
        cityTimezoneMap.put("pittsburgh", "America/New_York");
        cityTimezoneMap.put("anchorage", "America/Anchorage");
        cityTimezoneMap.put("honolulu", "Pacific/Honolulu");
        cityTimezoneMap.put("baltimore", "America/New_York");
        cityTimezoneMap.put("hialeah", "America/New_York");
        cityTimezoneMap.put("oxnard", "America/Los_Angeles");
        cityTimezoneMap.put("cape coral", "America/New_York");
        cityTimezoneMap.put("grand rapids", "America/New_York");
        cityTimezoneMap.put("salt lake city", "America/Denver");
        cityTimezoneMap.put("springfield", "America/Chicago");
        // UK cities
        cityTimezoneMap.put("london", "Europe/London");
        cityTimezoneMap.put("Europe", "Europe/London");
        cityTimezoneMap.put("manchester", "Europe/London");
        cityTimezoneMap.put("birmingham", "Europe/London");
        cityTimezoneMap.put("glasgow", "Europe/London");
        cityTimezoneMap.put("edinburgh", "Europe/London");
        cityTimezoneMap.put("liverpool", "Europe/London");
        cityTimezoneMap.put("bristol", "Europe/London");
        cityTimezoneMap.put("sheffield", "Europe/London");
        cityTimezoneMap.put("leeds", "Europe/London");
        cityTimezoneMap.put("cardiff", "Europe/London");

        // Canadian cities
        cityTimezoneMap.put("toronto", "America/Toronto");
        cityTimezoneMap.put("America", "America/Toronto");
        cityTimezoneMap.put("vancouver", "America/Vancouver");
        cityTimezoneMap.put("montreal", "America/Montreal");
        cityTimezoneMap.put("calgary", "America/Edmonton");
        cityTimezoneMap.put("ottawa", "America/Toronto");
        cityTimezoneMap.put("edmonton", "America/Edmonton");
        cityTimezoneMap.put("quebec city", "America/Toronto");
        cityTimezoneMap.put("winnipeg", "America/Winnipeg");
        cityTimezoneMap.put("hamilton", "America/Toronto");
        cityTimezoneMap.put("kitchener", "America/Toronto");
        cityTimezoneMap.put("canada", "America/Toronto");

        // UAE cities
        cityTimezoneMap.put("dubai", "Asia/Dubai");
        cityTimezoneMap.put("abu dhabi", "Asia/Dubai");
        cityTimezoneMap.put("sharjah", "Asia/Dubai");
        cityTimezoneMap.put("ajman", "Asia/Dubai");
        cityTimezoneMap.put("fujairah", "Asia/Dubai");
        cityTimezoneMap.put("ras al khaimah", "Asia/Dubai");
        cityTimezoneMap.put("umm al quwain", "Asia/Dubai");
        cityTimezoneMap.put("america", "America/New_York");




//peru
        cityTimezoneMap.put("lima", "America/Lima");
        cityTimezoneMap.put("arequipa", "America/Lima");
        cityTimezoneMap.put("trujillo", "America/Lima");
        cityTimezoneMap.put("chiclayo", "America/Lima");
        cityTimezoneMap.put("cusco", "America/Lima");
        cityTimezoneMap.put("piura", "America/Lima");
        cityTimezoneMap.put("iquitos", "America/Lima");
        cityTimezoneMap.put("peru", "America/Lima");
//Pakistan
        cityTimezoneMap.put("karachi", "Asia/Karachi");
        cityTimezoneMap.put("lahore", "Asia/Karachi");
        cityTimezoneMap.put("islamabad", "Asia/Karachi");
        cityTimezoneMap.put("rawalpindi", "Asia/Karachi");
        cityTimezoneMap.put("faisalabad", "Asia/Karachi");
        cityTimezoneMap.put("peshawar", "Asia/Karachi");
        cityTimezoneMap.put("quetta", "Asia/Karachi");
        cityTimezoneMap.put("sialkot", "Asia/Karachi");
        cityTimezoneMap.put("multan", "Asia/Karachi");
        cityTimezoneMap.put("pakistan", "Asia/Karachi");
//indonesia
        cityTimezoneMap.put("jakarta", "Asia/Jakarta");
        cityTimezoneMap.put("surabaya", "Asia/Jakarta");
        cityTimezoneMap.put("bandung", "Asia/Jakarta");
        cityTimezoneMap.put("medan", "Asia/Jakarta");
        cityTimezoneMap.put("semarang", "Asia/Jakarta");
        cityTimezoneMap.put("makassar", "Asia/Makassar");
        cityTimezoneMap.put("denpasar", "Asia/Makassar");
        cityTimezoneMap.put("indonesia", "Asia/Jakarta");
//thiland
        cityTimezoneMap.put("bangkok", "Asia/Bangkok");
        cityTimezoneMap.put("chiang mai", "Asia/Bangkok");
        cityTimezoneMap.put("phuket", "Asia/Bangkok");
        cityTimezoneMap.put("pattaya", "Asia/Bangkok");
        cityTimezoneMap.put("hat yai", "Asia/Bangkok");
        cityTimezoneMap.put("thailand", "Asia/Bangkok");
//sri lanka
        cityTimezoneMap.put("colombo", "Asia/Colombo");
        cityTimezoneMap.put("kandy", "Asia/Colombo");
        cityTimezoneMap.put("galle", "Asia/Colombo");
        cityTimezoneMap.put("jaffna", "Asia/Colombo");
        cityTimezoneMap.put("sri lanka", "Asia/Colombo");
        cityTimezoneMap.put("srilanka", "Asia/Colombo");
//maldives
        cityTimezoneMap.put("male", "Indian/Maldives");
        cityTimezoneMap.put("addu city", "Indian/Maldives");
        cityTimezoneMap.put("fuvahmulah", "Indian/Maldives");
        cityTimezoneMap.put("maldives", "Indian/Maldives");
//china
        cityTimezoneMap.put("beijing", "Asia/Shanghai");
        cityTimezoneMap.put("shanghai", "Asia/Shanghai");
        cityTimezoneMap.put("guangzhou", "Asia/Shanghai");
        cityTimezoneMap.put("shenzhen", "Asia/Shanghai");
        cityTimezoneMap.put("chengdu", "Asia/Shanghai");
        cityTimezoneMap.put("wuhan", "Asia/Shanghai");
        cityTimezoneMap.put("tianjin", "Asia/Shanghai");
        cityTimezoneMap.put("china", "Asia/Shanghai");
//nepal
        cityTimezoneMap.put("kathmandu", "Asia/Kathmandu");
        cityTimezoneMap.put("pokhara", "Asia/Kathmandu");
        cityTimezoneMap.put("lalitpur", "Asia/Kathmandu");
        cityTimezoneMap.put("biratnagar", "Asia/Kathmandu");
        cityTimezoneMap.put("nepal", "Asia/Kathmandu");
//iran
        cityTimezoneMap.put("tehran", "Asia/Tehran");
        cityTimezoneMap.put("mashhad", "Asia/Tehran");
        cityTimezoneMap.put("isfahan", "Asia/Tehran");
        cityTimezoneMap.put("karaj", "Asia/Tehran");
        cityTimezoneMap.put("shiraz", "Asia/Tehran");
        cityTimezoneMap.put("iran", "Asia/Tehran");
//Russia
        cityTimezoneMap.put("moscow", "Europe/Moscow");
        cityTimezoneMap.put("st petersburg", "Europe/Moscow");
        cityTimezoneMap.put("novosibirsk", "Asia/Novosibirsk");
        cityTimezoneMap.put("yekaterinburg", "Asia/Yekaterinburg");
        cityTimezoneMap.put("kazan", "Europe/Moscow");
        cityTimezoneMap.put("samara", "Europe/Samara");
        cityTimezoneMap.put("vladivostok", "Asia/Vladivostok");
        cityTimezoneMap.put("russia", "Europe/Moscow");
//japan
        cityTimezoneMap.put("tokyo", "Asia/Tokyo");
        cityTimezoneMap.put("osaka", "Asia/Tokyo");
        cityTimezoneMap.put("yokohama", "Asia/Tokyo");
        cityTimezoneMap.put("nagoya", "Asia/Tokyo");
        cityTimezoneMap.put("sapporo", "Asia/Tokyo");
        cityTimezoneMap.put("fukuoka", "Asia/Tokyo");
        cityTimezoneMap.put("japan", "Asia/Tokyo");
//austria
        cityTimezoneMap.put("sydney", "Australia/Sydney");
        cityTimezoneMap.put("melbourne", "Australia/Melbourne");
        cityTimezoneMap.put("brisbane", "Australia/Brisbane");
        cityTimezoneMap.put("perth", "Australia/Perth");
        cityTimezoneMap.put("adelaide", "Australia/Adelaide");
        cityTimezoneMap.put("canberra", "Australia/Sydney");
        cityTimezoneMap.put("australia", "Australia/Sydney");
//africa
        cityTimezoneMap.put("lagos", "Africa/Lagos");
        cityTimezoneMap.put("cairo", "Africa/Cairo");
        cityTimezoneMap.put("nairobi", "Africa/Nairobi");
        cityTimezoneMap.put("johannesburg", "Africa/Johannesburg");
        cityTimezoneMap.put("capetown", "Africa/Johannesburg");
        cityTimezoneMap.put("algiers", "Africa/Algiers");
        cityTimezoneMap.put("accra", "Africa/Accra");
        cityTimezoneMap.put("kinshasa", "Africa/Kinshasa");
        cityTimezoneMap.put("africa", "Africa/Johannesburg");
//brazil
        cityTimezoneMap.put("sao paulo", "America/Sao_Paulo");
        cityTimezoneMap.put("rio de janeiro", "America/Sao_Paulo");
        cityTimezoneMap.put("riodejaneiro", "America/Sao_Paulo");
        cityTimezoneMap.put("brasilia", "America/Sao_Paulo");
        cityTimezoneMap.put("salvador", "America/Bahia");
        cityTimezoneMap.put("fortaleza", "America/Fortaleza");
        cityTimezoneMap.put("belo horizonte", "America/Sao_Paulo");
        cityTimezoneMap.put("curitiba", "America/Sao_Paulo");
        cityTimezoneMap.put("brazil", "America/Sao_Paulo");
//west indies
        cityTimezoneMap.put("kingston", "America/Jamaica");
        cityTimezoneMap.put("port of spain", "America/Port_of_Spain");
        cityTimezoneMap.put("bridgetown", "America/Barbados");
        cityTimezoneMap.put("nassau", "America/Nassau");
        cityTimezoneMap.put("georgetown", "America/Guyana");
        cityTimezoneMap.put("caribbean", "America/Barbados");
        cityTimezoneMap.put("westindies", "America/Barbados");
        cityTimezoneMap.put("west indies", "America/Barbados");
//south korea
        cityTimezoneMap.put("seoul", "Asia/Seoul");
        cityTimezoneMap.put("busan", "Asia/Seoul");
        cityTimezoneMap.put("incheon", "Asia/Seoul");
        cityTimezoneMap.put("daegu", "Asia/Seoul");
        cityTimezoneMap.put("daejeon", "Asia/Seoul");
        cityTimezoneMap.put("gwangju", "Asia/Seoul");
        cityTimezoneMap.put("suwon", "Asia/Seoul");
        cityTimezoneMap.put("ulsan", "Asia/Seoul");
        cityTimezoneMap.put("jeju", "Asia/Seoul");
        cityTimezoneMap.put("south korea", "Asia/Seoul");
        cityTimezoneMap.put("southkorea", "Asia/Seoul");
        cityTimezoneMap.put("korea", "Asia/Seoul");
//north korea
        cityTimezoneMap.put("pyongyang", "Asia/Pyongyang");
        cityTimezoneMap.put("hamhung", "Asia/Pyongyang");
        cityTimezoneMap.put("chongjin", "Asia/Pyongyang");
        cityTimezoneMap.put("kaesong", "Asia/Pyongyang");
        cityTimezoneMap.put("wonsan", "Asia/Pyongyang");
        cityTimezoneMap.put("sinuiju", "Asia/Pyongyang");
        cityTimezoneMap.put("north korea", "Asia/Pyongyang");

        cityTimezoneMap.put("florida", "America/New_York");

        cityTimezoneMap.put("orlando", "America/New_York");


        cityTimezoneMap.put("tallahassee", "America/New_York");
        cityTimezoneMap.put("fort lauderdale", "America/New_York");
        cityTimezoneMap.put("west palm beach", "America/New_York");
        cityTimezoneMap.put("gainesville", "America/New_York");
        cityTimezoneMap.put("daytona beach", "America/New_York");
        cityTimezoneMap.put("fort myers", "America/New_York");

/// Time zone wise start Here..
        cityTimezoneMap.put("Etc/GMT+12", "Etc/GMT+12");  // UTC-12
        cityTimezoneMap.put("Pacific/Niue", "Pacific/Niue");  // UTC-11
        cityTimezoneMap.put("Pacific/Pago_Pago", "Pacific/Pago_Pago");  // UTC-11
        cityTimezoneMap.put("Pacific/Honolulu", "Pacific/Honolulu");  // UTC-10
        cityTimezoneMap.put("America/Anchorage", "America/Anchorage");  // UTC-9
        cityTimezoneMap.put("America/Los_Angeles", "America/Los_Angeles");  // UTC-8
        cityTimezoneMap.put("America/Phoenix", "America/Phoenix");  // UTC-7
        cityTimezoneMap.put("America/Denver", "America/Denver");  // UTC-7
        cityTimezoneMap.put("America/Chicago", "America/Chicago");  // UTC-6
        cityTimezoneMap.put("America/Mexico_City", "America/Mexico_City");  // UTC-6
        cityTimezoneMap.put("America/New_York", "America/New_York");  // UTC-5
        cityTimezoneMap.put("America/Bogota", "America/Bogota");  // UTC-5
        cityTimezoneMap.put("America/Caracas", "America/Caracas");  // UTC-4:30
        cityTimezoneMap.put("America/Halifax", "America/Halifax");  // UTC-4
        cityTimezoneMap.put("America/Santiago", "America/Santiago");  // UTC-3
        cityTimezoneMap.put("America/Argentina/Buenos_Aires", "America/Argentina/Buenos_Aires");  // UTC-3
        cityTimezoneMap.put("America/Sao_Paulo", "America/Sao_Paulo");  // UTC-3
        cityTimezoneMap.put("Atlantic/Cape_Verde", "Atlantic/Cape_Verde");  // UTC-1
        cityTimezoneMap.put("Europe/London", "Europe/London");  // UTC+0
        cityTimezoneMap.put("Europe/Lisbon", "Europe/Lisbon");  // UTC+0
        cityTimezoneMap.put("Africa/Casablanca", "Africa/Casablanca");  // UTC+0
        cityTimezoneMap.put("Africa/Lagos", "Africa/Lagos");  // UTC+1
        cityTimezoneMap.put("Europe/Paris", "Europe/Paris");  // UTC+1
        cityTimezoneMap.put("Europe/Berlin", "Europe/Berlin");  // UTC+1
        cityTimezoneMap.put("Europe/Madrid", "Europe/Madrid");  // UTC+1
        cityTimezoneMap.put("Europe/Rome", "Europe/Rome");  // UTC+1
        cityTimezoneMap.put("Europe/Zurich", "Europe/Zurich");  // UTC+1
        cityTimezoneMap.put("Europe/Brussels", "Europe/Brussels");  // UTC+1
        cityTimezoneMap.put("Europe/Warsaw", "Europe/Warsaw");  // UTC+1
        cityTimezoneMap.put("Africa/Johannesburg", "Africa/Johannesburg");  // UTC+2
        cityTimezoneMap.put("Europe/Athens", "Europe/Athens");  // UTC+2
        cityTimezoneMap.put("Asia/Beirut", "Asia/Beirut");  // UTC+2
        cityTimezoneMap.put("Asia/Jerusalem", "Asia/Jerusalem");  // UTC+2
        cityTimezoneMap.put("Europe/Moscow", "Europe/Moscow");  // UTC+3
        cityTimezoneMap.put("Asia/Baghdad", "Asia/Baghdad");  // UTC+3
        cityTimezoneMap.put("Asia/Riyadh", "Asia/Riyadh");  // UTC+3
        cityTimezoneMap.put("Asia/Tehran", "Asia/Tehran");  // UTC+3:30
        cityTimezoneMap.put("Asia/Dubai", "Asia/Dubai");  // UTC+4
        cityTimezoneMap.put("Asia/Baku", "Asia/Baku");  // UTC+4
        cityTimezoneMap.put("Asia/Kabul", "Asia/Kabul");  // UTC+4:30
        cityTimezoneMap.put("Asia/Karachi", "Asia/Karachi");  // UTC+5
        cityTimezoneMap.put("Asia/Tashkent", "Asia/Tashkent");  // UTC+5
        cityTimezoneMap.put("Asia/Colombo", "Asia/Colombo");  // UTC+5:30
        cityTimezoneMap.put("Asia/Kolkata", "Asia/Kolkata");  // UTC+5:30
        cityTimezoneMap.put("Asia/Kathmandu", "Asia/Kathmandu");  // UTC+5:45
        cityTimezoneMap.put("Asia/Dhaka", "Asia/Dhaka");  // UTC+6
        cityTimezoneMap.put("Asia/Yangon", "Asia/Yangon");  // UTC+6:30
        cityTimezoneMap.put("Asia/Bangkok", "Asia/Bangkok");  // UTC+7
        cityTimezoneMap.put("Asia/Jakarta", "Asia/Jakarta");  // UTC+7
        cityTimezoneMap.put("Asia/Shanghai", "Asia/Shanghai");  // UTC+8
        cityTimezoneMap.put("Asia/Singapore", "Asia/Singapore");  // UTC+8
        cityTimezoneMap.put("Asia/Tokyo", "Asia/Tokyo");  // UTC+9
        cityTimezoneMap.put("Asia/Seoul", "Asia/Seoul");  // UTC+9
        cityTimezoneMap.put("Australia/Adelaide", "Australia/Adelaide");  // UTC+9:30
        cityTimezoneMap.put("Australia/Sydney", "Australia/Sydney");  // UTC+10
        cityTimezoneMap.put("Australia/Brisbane", "Australia/Brisbane");  // UTC+10
        cityTimezoneMap.put("Pacific/Guam", "Pacific/Guam");  // UTC+10
        cityTimezoneMap.put("Pacific/Noumea", "Pacific/Noumea");  // UTC+11
        cityTimezoneMap.put("Pacific/Fiji", "Pacific/Fiji");  // UTC+12
        cityTimezoneMap.put("Pacific/Tongatapu", "Pacific/Tongatapu");  // UTC+13
        cityTimezoneMap.put("Pacific/Kiritimati", "Pacific/Kiritimati");  // UTC+14

/// Time zone ends here..
        cityTimezoneMap.put("paris", "Europe/Paris");
        cityTimezoneMap.put("lyon", "Europe/Paris");
        cityTimezoneMap.put("marseille", "Europe/Paris");
        cityTimezoneMap.put("toulouse", "Europe/Paris");
        cityTimezoneMap.put("nice", "Europe/Paris");
        cityTimezoneMap.put("nantes", "Europe/Paris");
        cityTimezoneMap.put("strasbourg", "Europe/Paris");
        cityTimezoneMap.put("montpellier", "Europe/Paris");
        cityTimezoneMap.put("bordeaux", "Europe/Paris");
        cityTimezoneMap.put("lille", "Europe/Paris");
        cityTimezoneMap.put("rennes", "Europe/Paris");
        cityTimezoneMap.put("reims", "Europe/Paris");
        cityTimezoneMap.put("le havre", "Europe/Paris");
        cityTimezoneMap.put("saint-etienne", "Europe/Paris");
        cityTimezoneMap.put("toulon", "Europe/Paris");
        cityTimezoneMap.put("angers", "Europe/Paris");
        cityTimezoneMap.put("grenoble", "Europe/Paris");
        cityTimezoneMap.put("dijon", "Europe/Paris");
        cityTimezoneMap.put("nîmes", "Europe/Paris");
        cityTimezoneMap.put("metz", "Europe/Paris");
        cityTimezoneMap.put("besançon", "Europe/Paris");
// more
        // UTC-5
        cityTimezoneMap.put("cancun", "America/Cancun");
        cityTimezoneMap.put("chetumal", "America/Cancun");

// UTC-6
        cityTimezoneMap.put("mexico city", "America/Mexico_City");
        cityTimezoneMap.put("mexico", "America/Mexico_City");
        cityTimezoneMap.put("guadalajara", "America/Mexico_City");
        cityTimezoneMap.put("monterrey", "America/Monterrey");
        cityTimezoneMap.put("puebla", "America/Mexico_City");
        cityTimezoneMap.put("merida", "America/Merida");
        cityTimezoneMap.put("toluca", "America/Mexico_City");
        cityTimezoneMap.put("cuernavaca", "America/Mexico_City");
        cityTimezoneMap.put("leon", "America/Mexico_City");
        cityTimezoneMap.put("queretaro", "America/Mexico_City");

// UTC-7
        cityTimezoneMap.put("mazatlan", "America/Mazatlan");
        cityTimezoneMap.put("hermosillo", "America/Hermosillo");
        cityTimezoneMap.put("chihuahua", "America/Chihuahua");
        cityTimezoneMap.put("ciudad juarez", "America/Ojinaga");
        cityTimezoneMap.put("culiacan", "America/Mazatlan");
        cityTimezoneMap.put("tijuana", "America/Tijuana");

// Baja California Sur (UTC-7)
        cityTimezoneMap.put("la paz", "America/Mazatlan");
        cityTimezoneMap.put("los cabos", "America/Mazatlan");

// UTC-8
        cityTimezoneMap.put("ensenada", "America/Tijuana");

        cityTimezoneMap.put("egpty", "Africa/Cairo");
        cityTimezoneMap.put("alexandria", "Africa/Cairo");
        cityTimezoneMap.put("giza", "Africa/Cairo");
        cityTimezoneMap.put("sharm el-sheikh", "Africa/Cairo");
        cityTimezoneMap.put("hurghada", "Africa/Cairo");
        cityTimezoneMap.put("luxor", "Africa/Cairo");
        cityTimezoneMap.put("aswan", "Africa/Cairo");
        cityTimezoneMap.put("port said", "Africa/Cairo");
        cityTimezoneMap.put("suez", "Africa/Cairo");
        cityTimezoneMap.put("mansoura", "Africa/Cairo");

        cityTimezoneMap.put("baghdad", "Asia/Baghdad");
        cityTimezoneMap.put("basra", "Asia/Baghdad");
        cityTimezoneMap.put("mosul", "Asia/Baghdad");
        cityTimezoneMap.put("erbil", "Asia/Baghdad");
        cityTimezoneMap.put("sulaimaniyah", "Asia/Baghdad");
        cityTimezoneMap.put("najaf", "Asia/Baghdad");
        cityTimezoneMap.put("karbala", "Asia/Baghdad");
        cityTimezoneMap.put("dhi qar", "Asia/Baghdad");
        cityTimezoneMap.put("diwaniya", "Asia/Baghdad");
        cityTimezoneMap.put("tikrit", "Asia/Baghdad");
        cityTimezoneMap.put("belgium", "Asia/Baghdad");
        cityTimezoneMap.put("vienna", "Europe/Vienna");
        cityTimezoneMap.put("salzburg", "Europe/Vienna");
        cityTimezoneMap.put("innsbruck", "Europe/Vienna");
        cityTimezoneMap.put("grazer", "Europe/Vienna");
        cityTimezoneMap.put("linz", "Europe/Vienna");
        cityTimezoneMap.put("klagenfurt", "Europe/Vienna");
        cityTimezoneMap.put("wels", "Europe/Vienna");
        cityTimezoneMap.put("st. polten", "Europe/Vienna");
        cityTimezoneMap.put("bregenz", "Europe/Vienna");
        cityTimezoneMap.put("baden", "Europe/Vienna");
        cityTimezoneMap.put("austria", "Europe/Vienna");

        cityTimezoneMap.put("france", "Europe/Paris");

        cityTimezoneMap.put("ramadi", "Asia/Baghdad");
        cityTimezoneMap.put("fallujah", "Asia/Baghdad");
        cityTimezoneMap.put("kirkuk", "Asia/Baghdad");
        cityTimezoneMap.put("dohuk", "Asia/Baghdad");
        cityTimezoneMap.put("samarra", "Asia/Baghdad");
        cityTimezoneMap.put("kut", "Asia/Baghdad");
        cityTimezoneMap.put("iraq", "Asia/Baghdad");

        cityTimezoneMap.put("amsterdam", "Europe/Amsterdam");
        cityTimezoneMap.put("rotterdam", "Europe/Amsterdam");
        cityTimezoneMap.put("the hague", "Europe/Amsterdam");
        cityTimezoneMap.put("utrecht", "Europe/Amsterdam");
        cityTimezoneMap.put("eindhoven", "Europe/Amsterdam");
        cityTimezoneMap.put("tilburg", "Europe/Amsterdam");
        cityTimezoneMap.put("groningen", "Europe/Amsterdam");
        cityTimezoneMap.put("almere", "Europe/Amsterdam");
        cityTimezoneMap.put("breda", "Europe/Amsterdam");
        cityTimezoneMap.put("nijmegen", "Europe/Amsterdam");
        cityTimezoneMap.put("enschede", "Europe/Amsterdam");
        cityTimezoneMap.put("haarlem", "Europe/Amsterdam");
        cityTimezoneMap.put("amersfoort", "Europe/Amsterdam");
        cityTimezoneMap.put("zwolle", "Europe/Amsterdam");
        cityTimezoneMap.put("leidse", "Europe/Amsterdam");
        cityTimezoneMap.put("netherland", "Europe/Amsterdam");

        cityTimezoneMap.put("istanbul", "Europe/Istanbul");
        cityTimezoneMap.put("ankara", "Europe/Istanbul");
        cityTimezoneMap.put("izmir", "Europe/Istanbul");
        cityTimezoneMap.put("bursa", "Europe/Istanbul");
        cityTimezoneMap.put("adana", "Europe/Istanbul");
        cityTimezoneMap.put("gaziantep", "Europe/Istanbul");
        cityTimezoneMap.put("konya", "Europe/Istanbul");
        cityTimezoneMap.put("kayseri", "Europe/Istanbul");
        cityTimezoneMap.put("antalya", "Europe/Istanbul");
        cityTimezoneMap.put("malatya", "Europe/Istanbul");
        cityTimezoneMap.put("samsun", "Europe/Istanbul");
        cityTimezoneMap.put("trabzon", "Europe/Istanbul");
        cityTimezoneMap.put("eskisehir", "Europe/Istanbul");
        cityTimezoneMap.put("mardin", "Europe/Istanbul");
        cityTimezoneMap.put("diyarbakir", "Europe/Istanbul");
        cityTimezoneMap.put("usak", "Europe/Istanbul");
        cityTimezoneMap.put("turkey", "Europe/Istanbul");

        cityTimezoneMap.put("zurich", "Europe/Zurich");
        cityTimezoneMap.put("geneva", "Europe/Zurich");
        cityTimezoneMap.put("basel", "Europe/Zurich");
        cityTimezoneMap.put("lausanne", "Europe/Zurich");
        cityTimezoneMap.put("bern", "Europe/Zurich");
        cityTimezoneMap.put("winterthur", "Europe/Zurich");
        cityTimezoneMap.put("lucerne", "Europe/Zurich");
        cityTimezoneMap.put("st. gallen", "Europe/Zurich");
        cityTimezoneMap.put("lugano", "Europe/Zurich");
        cityTimezoneMap.put("biel", "Europe/Zurich");
        cityTimezoneMap.put("thun", "Europe/Zurich");
        cityTimezoneMap.put("koniz", "Europe/Zurich");
        cityTimezoneMap.put("la chaux-de-fonds", "Europe/Zurich");
        cityTimezoneMap.put("freiburg", "Europe/Zurich");
        cityTimezoneMap.put("switzerland", "Europe/Zurich");


        cityTimezoneMap.put("south africa", "Africa/Johannesburg");
        cityTimezoneMap.put("cape town", "Africa/Johannesburg");
        cityTimezoneMap.put("southafrica", "Africa/Johannesburg");
        cityTimezoneMap.put("durban", "Africa/Johannesburg");
        cityTimezoneMap.put("pretoria", "Africa/Johannesburg");
        cityTimezoneMap.put("port elizabeth", "Africa/Johannesburg");
        cityTimezoneMap.put("bloemfontein", "Africa/Johannesburg");
        cityTimezoneMap.put("east london", "Africa/Johannesburg");
        cityTimezoneMap.put("pietermaritzburg", "Africa/Johannesburg");
        cityTimezoneMap.put("kimberley", "Africa/Johannesburg");
        cityTimezoneMap.put("polokwane", "Africa/Johannesburg");
        cityTimezoneMap.put("nelspruit", "Africa/Johannesburg");
        cityTimezoneMap.put("rustenburg", "Africa/Johannesburg");
        cityTimezoneMap.put("vanderbijlpark", "Africa/Johannesburg");
        cityTimezoneMap.put("george", "Africa/Johannesburg");

        cityTimezoneMap.put("hanoi", "Asia/Ho_Chi_Minh");
        cityTimezoneMap.put("ho chi minh city", "Asia/Ho_Chi_Minh");
        cityTimezoneMap.put("da nang", "Asia/Ho_Chi_Minh");
        cityTimezoneMap.put("hai phong", "Asia/Ho_Chi_Minh");
        cityTimezoneMap.put("can tho", "Asia/Ho_Chi_Minh");
        cityTimezoneMap.put("bien hoa", "Asia/Ho_Chi_Minh");
        cityTimezoneMap.put("nha trang", "Asia/Ho_Chi_Minh");
        cityTimezoneMap.put("vung tau", "Asia/Ho_Chi_Minh");
        cityTimezoneMap.put("hue", "Asia/Ho_Chi_Minh");
        cityTimezoneMap.put("thanh hoa", "Asia/Ho_Chi_Minh");
        cityTimezoneMap.put("quang ninh", "Asia/Ho_Chi_Minh");
        cityTimezoneMap.put("bac ninh", "Asia/Ho_Chi_Minh");
        cityTimezoneMap.put("ha tinh", "Asia/Ho_Chi_Minh");
        cityTimezoneMap.put("da lat", "Asia/Ho_Chi_Minh");
        cityTimezoneMap.put("vietnam", "Asia/Ho_Chi_Minh");

        cityTimezoneMap.put("madrid", "Europe/Madrid");
        cityTimezoneMap.put("barcelona", "Europe/Madrid");
        cityTimezoneMap.put("valencia", "Europe/Madrid");
        cityTimezoneMap.put("seville", "Europe/Madrid");
        cityTimezoneMap.put("zaragoza", "Europe/Madrid");
        cityTimezoneMap.put("malaga", "Europe/Madrid");
        cityTimezoneMap.put("murcia", "Europe/Madrid");
        cityTimezoneMap.put("palma", "Europe/Madrid");
        cityTimezoneMap.put("las palmas", "Atlantic/Canary");
        cityTimezoneMap.put("bilbao", "Europe/Madrid");
        cityTimezoneMap.put("alicante", "Europe/Madrid");
        cityTimezoneMap.put("cordoba", "Europe/Madrid");
        cityTimezoneMap.put("valladolid", "Europe/Madrid");
        cityTimezoneMap.put("vigo", "Europe/Madrid");
        cityTimezoneMap.put("granada", "Europe/Madrid");
        cityTimezoneMap.put("salamanca", "Europe/Madrid");
        cityTimezoneMap.put("spain", "Europe/Madrid");

        cityTimezoneMap.put("singapore", "Asia/Singapore");
        cityTimezoneMap.put("kuwait", "Asia/Kuwait");
        cityTimezoneMap.put("copenhagen", "Europe/Copenhagen");
        cityTimezoneMap.put("aarhus", "Europe/Copenhagen");
        cityTimezoneMap.put("odense", "Europe/Copenhagen");
        cityTimezoneMap.put("aalborg", "Europe/Copenhagen");
        cityTimezoneMap.put("esbjerg", "Europe/Copenhagen");
        cityTimezoneMap.put("denmark", "Europe/Copenhagen");
        cityTimezoneMap.put("berlin", "Europe/Berlin");
        cityTimezoneMap.put("hamburg", "Europe/Berlin");
        cityTimezoneMap.put("munich", "Europe/Berlin");
        cityTimezoneMap.put("cologne", "Europe/Berlin");
        cityTimezoneMap.put("frankfurt", "Europe/Berlin");
        cityTimezoneMap.put("stuttgart", "Europe/Berlin");
        cityTimezoneMap.put("dusseldorf", "Europe/Berlin");
        cityTimezoneMap.put("leipzig", "Europe/Berlin");
        cityTimezoneMap.put("dortmund", "Europe/Berlin");
        cityTimezoneMap.put("essen", "Europe/Berlin");
        cityTimezoneMap.put("germany", "Europe/Berlin");

        cityTimezoneMap.put("dublin", "Europe/Dublin");
        cityTimezoneMap.put("cork", "Europe/Dublin");
        cityTimezoneMap.put("limerick", "Europe/Dublin");
        cityTimezoneMap.put("galway", "Europe/Dublin");
        cityTimezoneMap.put("waterford", "Europe/Dublin");
        cityTimezoneMap.put("kilkenny", "Europe/Dublin");
        cityTimezoneMap.put("swords", "Europe/Dublin");
        cityTimezoneMap.put("drogheda", "Europe/Dublin");
        cityTimezoneMap.put("bray", "Europe/Dublin");
        cityTimezoneMap.put("navan", "Europe/Dublin");
        cityTimezoneMap.put("ireland", "Europe/Dublin");

        cityTimezoneMap.put("amman", "Asia/Amman");
        cityTimezoneMap.put("zarqa", "Asia/Amman");
        cityTimezoneMap.put("irbid", "Asia/Amman");
        cityTimezoneMap.put("ajloun", "Asia/Amman");
        cityTimezoneMap.put("madaba", "Asia/Amman");
        cityTimezoneMap.put("karak", "Asia/Amman");
        cityTimezoneMap.put("salt", "Asia/Amman");
        cityTimezoneMap.put("tafilah", "Asia/Amman");
        cityTimezoneMap.put("mafraq", "Asia/Amman");
        cityTimezoneMap.put("jordon", "Asia/Amman");
        cityTimezoneMap.put("helsinki", "Europe/Helsinki");
        cityTimezoneMap.put("espoo", "Europe/Helsinki");
        cityTimezoneMap.put("tampere", "Europe/Helsinki");
        cityTimezoneMap.put("vantaa", "Europe/Helsinki");
        cityTimezoneMap.put("Oulu", "Europe/Helsinki");
        cityTimezoneMap.put("kotka", "Europe/Helsinki");
        cityTimezoneMap.put("lahti", "Europe/Helsinki");
        cityTimezoneMap.put("jyvaskyla", "Europe/Helsinki");
        cityTimezoneMap.put("pori", "Europe/Helsinki");
        cityTimezoneMap.put("vaasa", "Europe/Helsinki");
        cityTimezoneMap.put("finland", "Europe/Helsinki");
        cityTimezoneMap.put("europe", "Europe/Helsinki");

        cityTimezoneMap.put("Nuuk", "America/Godthab"); // UTC-3
        cityTimezoneMap.put("Sisimiut", "America/Sisimiut"); // UTC-3
        cityTimezoneMap.put("Ilulissat", "America/Ilulissat"); // UTC-3
        cityTimezoneMap.put("Qaqortoq", "America/Nuuk"); // UTC-3
        cityTimezoneMap.put("Aasiaat", "America/Aasiaat"); // UTC-3
        cityTimezoneMap.put("Qaanaaq", "America/Thule"); // UTC-4
        cityTimezoneMap.put("Tasiilaq", "America/Nuuk"); // UTC-3
        cityTimezoneMap.put("Nanortalik", "America/Nuuk"); // UTC-3
        cityTimezoneMap.put("Narsaq", "America/Nuuk"); // UTC-3
        cityTimezoneMap.put("Kangerlussuaq", "America/Nuuk"); // UTC-3
        cityTimezoneMap.put("greenland", "America/Nuuk"); // UTC-3


        cityTimezoneMap.put("wellington", "Pacific/Auckland"); // UTC+12
        cityTimezoneMap.put("auckland", "Pacific/Auckland"); // UTC+12
        cityTimezoneMap.put("christchurch", "Pacific/Auckland"); // UTC+12
        cityTimezoneMap.put("new zaland", "Pacific/Auckland"); // UTC+12
        cityTimezoneMap.put("dunedin", "Pacific/Auckland"); // UTC+12
        cityTimezoneMap.put("tauranga", "Pacific/Auckland"); // UTC+12
        cityTimezoneMap.put("napier", "Pacific/Auckland"); // UTC+12
        cityTimezoneMap.put("palmerston north", "Pacific/Auckland"); // UTC+12
        cityTimezoneMap.put("whangarei", "Pacific/Auckland"); // UTC+12
        cityTimezoneMap.put("invercargill", "Pacific/Auckland"); // UTC+12

        cityTimezoneMap.put("warsaw", "Europe/Warsaw"); // UTC+1
        cityTimezoneMap.put("krakow", "Europe/Warsaw"); // UTC+1
        cityTimezoneMap.put("lodz", "Europe/Warsaw"); // UTC+1
        cityTimezoneMap.put("wroclaw", "Europe/Warsaw"); // UTC+1
        cityTimezoneMap.put("poznan", "Europe/Warsaw"); // UTC+1
        cityTimezoneMap.put("gdansk", "Europe/Warsaw"); // UTC+1
        cityTimezoneMap.put("szczecin", "Europe/Warsaw"); // UTC+1
        cityTimezoneMap.put("bydgoszcz", "Europe/Warsaw"); // UTC+1
        cityTimezoneMap.put("lublin", "Europe/Warsaw"); // UTC+1
        cityTimezoneMap.put("katowice", "Europe/Warsaw"); // UTC+1
        cityTimezoneMap.put("poland", "Europe/Warsaw"); // UTC+1

        cityTimezoneMap.put("new zealand", "Pacific/Auckland");
        cityTimezoneMap.put("newzealand", "Pacific/Auckland");// UTC+12

        cityTimezoneMap.put("reykjavik", "Atlantic/Reykjavik"); // UTC+0
        cityTimezoneMap.put("akureyri", "Atlantic/Reykjavik"); // UTC+0
        cityTimezoneMap.put("keflavik", "Atlantic/Reykjavik"); // UTC+0
        cityTimezoneMap.put("hafnarfjordur", "Atlantic/Reykjavik"); // UTC+0
        cityTimezoneMap.put("kopavogur", "Atlantic/Reykjavik"); // UTC+0
        cityTimezoneMap.put("selfoss", "Atlantic/Reykjavik"); // UTC+0
        cityTimezoneMap.put("vestmannaeyjar", "Atlantic/Reykjavik"); // UTC+0
        cityTimezoneMap.put("iceland", "Atlantic/Reykjavik"); // UTC+0
        cityTimezoneMap.put("ice land", "Atlantic/Reykjavik"); // UTC+0
        cityTimezoneMap.put("Atlantic", "Atlantic/Reykjavik"); // UTC+0
        cityTimezoneMap.put("atlantic", "Atlantic/Reykjavik"); // UTC+0
//24 timezone

        // UTC-12:00
        cityTimezoneMap.put("baker island", "Etc/GMT+12");

// UTC-11:00
        cityTimezoneMap.put("midway atoll", "Pacific/Midway");

// UTC-10:00
        cityTimezoneMap.put("honolulu", "Pacific/Honolulu");

// UTC-09:00
        cityTimezoneMap.put("anchorage", "America/Anchorage");

// UTC-08:00
        cityTimezoneMap.put("los angeles", "America/Los_Angeles");

// UTC-07:00
        cityTimezoneMap.put("denver", "America/Denver");

// UTC-06:00
        cityTimezoneMap.put("chicago", "America/Chicago");

// UTC-05:00
        cityTimezoneMap.put("new york", "America/New_York");

// UTC-04:00
        cityTimezoneMap.put("santiago", "America/Santiago");

// UTC-03:00
        cityTimezoneMap.put("buenos aires", "America/Argentina/Buenos_Aires");

// UTC-02:00
        cityTimezoneMap.put("south georgia", "Atlantic/South_Georgia");

// UTC-01:00
        cityTimezoneMap.put("azores", "Atlantic/Azores");

// UTC±00:00
        cityTimezoneMap.put("london", "Europe/London");

// UTC+01:00
        cityTimezoneMap.put("paris", "Europe/Paris");

// UTC+02:00
        cityTimezoneMap.put("cairo", "Africa/Cairo");

// UTC+03:00
        cityTimezoneMap.put("moscow", "Europe/Moscow");

// UTC+04:00
        cityTimezoneMap.put("dubai", "Asia/Dubai");

// UTC+05:00
        cityTimezoneMap.put("karachi", "Asia/Karachi");

// UTC+06:00
        cityTimezoneMap.put("dhaka", "Asia/Dhaka");

// UTC+07:00
        cityTimezoneMap.put("bangkok", "Asia/Bangkok");

// UTC+08:00
        cityTimezoneMap.put("beijing", "Asia/Shanghai");

// UTC+09:00
        cityTimezoneMap.put("tokyo", "Asia/Tokyo");

// UTC+10:00
        cityTimezoneMap.put("sydney", "Australia/Sydney");

// UTC+11:00
        cityTimezoneMap.put("solomon islands", "Pacific/Guadalcanal");

// UTC+12:00
        cityTimezoneMap.put("auckland", "Pacific/Auckland");

        cityTimezoneMap.put("rome", "Europe/Rome"); // UTC+1
        cityTimezoneMap.put("milan", "Europe/Rome"); // UTC+1
        cityTimezoneMap.put("naples", "Europe/Rome"); // UTC+1
        cityTimezoneMap.put("turin", "Europe/Rome"); // UTC+1
        cityTimezoneMap.put("palermo", "Europe/Rome"); // UTC+1
        cityTimezoneMap.put("genoa", "Europe/Rome"); // UTC+1
        cityTimezoneMap.put("bologna", "Europe/Rome"); // UTC+1
        cityTimezoneMap.put("florence", "Europe/Rome"); // UTC+1
        cityTimezoneMap.put("venice", "Europe/Rome"); // UTC+1
        cityTimezoneMap.put("bari", "Europe/Rome"); // UTC+1
        cityTimezoneMap.put("italy", "Europe/Rome"); // UTC+1

        cityTimezoneMap.put("lisbon", "Europe/Lisbon"); // UTC+0
        cityTimezoneMap.put("porto", "Europe/Lisbon"); // UTC+0
        cityTimezoneMap.put("coimbra", "Europe/Lisbon"); // UTC+0
        cityTimezoneMap.put("braga", "Europe/Lisbon"); // UTC+0
        cityTimezoneMap.put("faro", "Europe/Lisbon"); // UTC+0
        cityTimezoneMap.put("funchal", "Atlantic/Madeira"); // UTC+0 (Madeira Island)
        cityTimezoneMap.put("ponta delgada", "Atlantic/Azores");
        cityTimezoneMap.put("portugal", "Atlantic/Azores");// UTC-1 (Azores)
        cityTimezoneMap.put("hong kong", "Asia/Hong_Kong");
        cityTimezoneMap.put("hongkong", "Asia/Hong_Kong");
        cityTimezoneMap.put("macao", "Asia/Macau"); // UTC+8
// UTC+8
        cityTimezoneMap.put("bogota", "America/Bogota"); // UTC-5
        cityTimezoneMap.put("medellin", "America/Bogota"); // UTC-5
        cityTimezoneMap.put("cali", "America/Bogota"); // UTC-5
        cityTimezoneMap.put("barranquilla", "America/Bogota"); // UTC-5
        cityTimezoneMap.put("cartagena", "America/Bogota"); // UTC-5
        cityTimezoneMap.put("colombia", "America/Bogota"); // UTC-5

        cityTimezoneMap.put("montevideo", "America/Montevideo"); // UTC-3
        cityTimezoneMap.put("salto", "America/Montevideo"); // UTC-3
        cityTimezoneMap.put("paysandu", "America/Montevideo"); // UTC-3
        cityTimezoneMap.put("maldonado", "America/Montevideo"); // UTC-3
        cityTimezoneMap.put("rivera", "America/Montevideo"); // UTC-3
        cityTimezoneMap.put("uruguay", "America/Montevideo"); // UTC-3
        cityTimezoneMap.put("united kingdom", "Europe/London");
        cityTimezoneMap.put("unitedkingdom", "Europe/London");// UTC+0
        cityTimezoneMap.put("united states", "America/New_York");
        cityTimezoneMap.put("unitedstates", "America/New_York");

        cityTimezoneMap.put("graz", "Europe/Vienna"); // UTC+1
        cityTimezoneMap.put("Austria", "Europe/Vienna"); // UTC+1
        cityTimezoneMap.put("kuala lumpur", "Asia/Kuala_Lumpur"); // UTC+8
        cityTimezoneMap.put("george town", "Asia/Kuala_Lumpur"); // UTC+8
        cityTimezoneMap.put("ipoh", "Asia/Kuala_Lumpur"); // UTC+8
        cityTimezoneMap.put("johor bahru", "Asia/Kuala_Lumpur"); // UTC+8
        cityTimezoneMap.put("kota kinabalu", "Asia/Kuala_Lumpur"); // UTC+8
        cityTimezoneMap.put("kuantan", "Asia/Kuala_Lumpur"); // UTC+8
        cityTimezoneMap.put("malacca", "Asia/Kuala_Lumpur"); // UTC+8
        cityTimezoneMap.put("shah alam", "Asia/Kuala_Lumpur");
        cityTimezoneMap.put("Malaysia", "Asia/Kuala_Lumpur");// UTC+8

        cityTimezoneMap.put("jerusalem", "Asia/Jerusalem"); // UTC+2
        cityTimezoneMap.put("tel aviv", "Asia/Jerusalem"); // UTC+2
        cityTimezoneMap.put("haifa", "Asia/Jerusalem"); // UTC+2
        cityTimezoneMap.put("beer sheva", "Asia/Jerusalem"); // UTC+2
        cityTimezoneMap.put("nazareth", "Asia/Jerusalem"); // UTC+2
        cityTimezoneMap.put("israel", "Asia/Jerusalem"); // UTC+2


        cityTimezoneMap.put("manama", "Asia/Bahrain"); // UTC+3
        cityTimezoneMap.put("hamad town", "Asia/Bahrain"); // UTC+3
        cityTimezoneMap.put("muharraq", "Asia/Bahrain"); // UTC+3
        cityTimezoneMap.put("sitra", "Asia/Bahrain"); // UTC+3
        cityTimezoneMap.put("daih", "Asia/Bahrain"); // UTC+3
        cityTimezoneMap.put("bahrain", "Asia/Bahrain"); // UTC+3

        cityTimezoneMap.put("rabatt", "Africa/Casablanca"); // UTC+1
        cityTimezoneMap.put("casablanca", "Africa/Casablanca"); // UTC+1
        cityTimezoneMap.put("marrakesh", "Africa/Casablanca"); // UTC+1
        cityTimezoneMap.put("fes", "Africa/Casablanca"); // UTC+1
        cityTimezoneMap.put("tangier", "Africa/Casablanca"); // UTC+1
        cityTimezoneMap.put("agadir", "Africa/Casablanca"); // UTC+1
        cityTimezoneMap.put("morocco", "Africa/Casablanca"); // UTC+1

        cityTimezoneMap.put("santo domingo", "America/Santo_Domingo"); // UTC-4
        cityTimezoneMap.put("dominican republic", "America/Santo_Domingo");
        cityTimezoneMap.put("dominicanrepublic", "America/Santo_Domingo");// UTC-4
        cityTimezoneMap.put("san pedro de macoris", "America/Santo_Domingo"); // UTC-4
        cityTimezoneMap.put("la romana", "America/Santo_Domingo"); // UTC-4
        cityTimezoneMap.put("puerto plata", "America/Santo_Domingo"); // UTC-4
        cityTimezoneMap.put("san francisco de macoris", "America/Santo_Domingo"); // UTC-4

        cityTimezoneMap.put("abudhabi", "Asia/Dubai"); // UTC+4
        cityTimezoneMap.put("United Arab Emirates", "Asia/Dubai"); // UTC+4
        cityTimezoneMap.put("UnitedArabEmirates", "Asia/Dubai"); // UTC+4
        cityTimezoneMap.put("United ArabEmirates", "Asia/Dubai"); // UTC+4
        cityTimezoneMap.put("UnitedArab Emirates", "Asia/Dubai"); // UTC+4


        cityTimezoneMap.put("turkiye", "Europe/Istanbul"); // UTC+3
        cityTimezoneMap.put("athens", "Europe/Athens"); // UTC+2, UTC+3 (DST)
        cityTimezoneMap.put("thessaloniki", "Europe/Athens"); // UTC+2, UTC+3 (DST)
        cityTimezoneMap.put("patras", "Europe/Athens"); // UTC+2, UTC+3 (DST)
        cityTimezoneMap.put("heraklion", "Europe/Athens"); // UTC+2, UTC+3 (DST)
        cityTimezoneMap.put("larissa", "Europe/Athens"); // UTC+2, UTC+3 (DST)
        cityTimezoneMap.put("volos", "Europe/Athens"); // UTC+2, UTC+3 (DST)
        cityTimezoneMap.put("kavala", "Europe/Athens"); // UTC+2, UTC+3 (DST)
        cityTimezoneMap.put("rhodes", "Europe/Athens");
        cityTimezoneMap.put("greece", "Europe/Athens");// UTC+2, UTC+3 (DST)

        cityTimezoneMap.put("stockholm", "Europe/Stockholm"); // UTC+1, UTC+2 (DST)
        cityTimezoneMap.put("gothenburg", "Europe/Stockholm"); // UTC+1, UTC+2 (DST)
        cityTimezoneMap.put("malmö", "Europe/Stockholm"); // UTC+1, UTC+2 (DST)
        cityTimezoneMap.put("uppsala", "Europe/Stockholm"); // UTC+1, UTC+2 (DST)
        cityTimezoneMap.put("västerås", "Europe/Stockholm"); // UTC+1, UTC+2 (DST)
        cityTimezoneMap.put("örebro", "Europe/Stockholm"); // UTC+1, UTC+2 (DST)
        cityTimezoneMap.put("linköping", "Europe/Stockholm"); // UTC+1, UTC+2 (DST)
        cityTimezoneMap.put("helsingborg", "Europe/Stockholm"); // UTC+1, UTC+2 (DST)
        cityTimezoneMap.put("lund", "Europe/Stockholm"); // UTC+1, UTC+2 (DST)
        cityTimezoneMap.put("umeå", "Europe/Stockholm");
        cityTimezoneMap.put("umea", "Europe/Stockholm");
        cityTimezoneMap.put("sweden", "Europe/Stockholm");// UTC+1, UTC+2 (DST)


        cityTimezoneMap.put("egypt", "Africa/Cairo"); // UTC+2
        cityTimezoneMap.put("tanta", "Africa/Cairo"); // UTC+2

        cityTimezoneMap.put("riyadh", "Asia/Riyadh"); // UTC+3
        cityTimezoneMap.put("jeddah", "Asia/Riyadh"); // UTC+3
        cityTimezoneMap.put("mecca", "Asia/Riyadh"); // UTC+3
        cityTimezoneMap.put("medina", "Asia/Riyadh"); // UTC+3
        cityTimezoneMap.put("dhahran", "Asia/Riyadh"); // UTC+3
        cityTimezoneMap.put("khobar", "Asia/Riyadh"); // UTC+3
        cityTimezoneMap.put("dammam", "Asia/Riyadh"); // UTC+3
        cityTimezoneMap.put("tabuk", "Asia/Riyadh"); // UTC+3
        cityTimezoneMap.put("abha", "Asia/Riyadh"); // UTC+3
        cityTimezoneMap.put("khamis mushait", "Asia/Riyadh");
        cityTimezoneMap.put("saudi arabia", "Asia/Riyadh");
        cityTimezoneMap.put("saudiarabia", "Asia/Riyadh");// UTC+3



        cityTimezoneMap.put("North Korea", "Asia/Pyongyang");
        cityTimezoneMap.put("NorthKorea", "Asia/Pyongyang");// UTC+9
        cityTimezoneMap.put("rason", "Asia/Pyongyang"); // UTC+9

        cityTimezoneMap.put("kabul", "Asia/Kabul"); // UTC+4:30
        cityTimezoneMap.put("kandahar", "Asia/Kabul"); // UTC+4:30
        cityTimezoneMap.put("herat", "Asia/Kabul"); // UTC+4:30
        cityTimezoneMap.put("mazar-i-sharif", "Asia/Kabul"); // UTC+4:30
        cityTimezoneMap.put("jalalabad", "Asia/Kabul"); // UTC+4:30
        cityTimezoneMap.put("ghazni", "Asia/Kabul"); // UTC+4:30
        cityTimezoneMap.put("bamyan", "Asia/Kabul"); // UTC+4:30
        cityTimezoneMap.put("logar", "Asia/Kabul"); // UTC+4:30
        cityTimezoneMap.put("paktia", "Asia/Kabul"); // UTC+4:30
        cityTimezoneMap.put("takhar", "Asia/Kabul");
        cityTimezoneMap.put("afghanistan", "Asia/Kabul");// UTC+4:30


        cityTimezoneMap.put("thimphu", "Asia/Thimphu"); // UTC+6
        cityTimezoneMap.put("phuentsholing", "Asia/Thimphu"); // UTC+6
        cityTimezoneMap.put("paro", "Asia/Thimphu"); // UTC+6
        cityTimezoneMap.put("punakha", "Asia/Thimphu"); // UTC+6
        cityTimezoneMap.put("gelephu", "Asia/Thimphu"); // UTC+6
        cityTimezoneMap.put("bhumthang", "Asia/Thimphu"); // UTC+6
        cityTimezoneMap.put("mongar", "Asia/Thimphu"); // UTC+6
        cityTimezoneMap.put("trashigang", "Asia/Thimphu"); // UTC+6
        cityTimezoneMap.put("samdrup jongkhar", "Asia/Thimphu");
        cityTimezoneMap.put("bhutan", "Asia/Thimphu");// UTC+6

        cityTimezoneMap.put("bangladesh", "Asia/Dhaka"); // UTC+6
        cityTimezoneMap.put("chittagong", "Asia/Dhaka"); // UTC+6
        cityTimezoneMap.put("khulna", "Asia/Dhaka"); // UTC+6
        cityTimezoneMap.put("rajshahi", "Asia/Dhaka"); // UTC+6
        cityTimezoneMap.put("barisal", "Asia/Dhaka"); // UTC+6
        cityTimezoneMap.put("sylhet", "Asia/Dhaka"); // UTC+6
        cityTimezoneMap.put("bogura", "Asia/Dhaka"); // UTC+6
        cityTimezoneMap.put("brahmanbaria", "Asia/Dhaka"); // UTC+6
        cityTimezoneMap.put("cumilla", "Asia/Dhaka"); // UTC+6
        cityTimezoneMap.put("narsingdi", "Asia/Dhaka"); // UTC+6

        cityTimezoneMap.put("yangon", "Asia/Yangon"); // UTC+6:30
        cityTimezoneMap.put("mandalay", "Asia/Yangon"); // UTC+6:30
        cityTimezoneMap.put("naypyidaw", "Asia/Yangon"); // UTC+6:30
        cityTimezoneMap.put("taunggyi", "Asia/Yangon"); // UTC+6:30
        cityTimezoneMap.put("bago", "Asia/Yangon"); // UTC+6:30
        cityTimezoneMap.put("monywa", "Asia/Yangon"); // UTC+6:30
        cityTimezoneMap.put("pathein", "Asia/Yangon"); // UTC+6:30
        cityTimezoneMap.put("sittwe", "Asia/Yangon"); // UTC+6:30
        cityTimezoneMap.put("mawlamein", "Asia/Yangon"); // UTC+6:30
        cityTimezoneMap.put("kyaukpyu", "Asia/Yangon");
        cityTimezoneMap.put("myanmar", "Asia/Yangon"); // UTC+6:30





    }
        public static String getTimezone(String city) {
        return cityTimezoneMap.get(city.trim().toLowerCase());
    }
}
