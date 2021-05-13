package main.java.models;

public class CountriesDB {
    private static String[] NAMES = new String[]{
            "Afganistán",
            "Albania",
            "Alemania",
            "Algeria",
            "Andorra",
            "Angola",
            "Anguila",
            "Antártida",
            "Antigua y Barbuda",
            "Antillas Neerlandesas",
            "Arabia Saudita",
            "Argentina",
            "Armenia",
            "Aruba",
            "Australia",
            "Austria",
            "Azerbayán",
            "Bélgica",
            "Bahamas",
            "Bahrein",
            "Bangladesh",
            "Barbados",
            "Belice",
            "Benín",
            "Bhután",
            "Bielorrusia",
            "Birmania",
            "Bolivia",
            "Bosnia y Herzegovina",
            "Botsuana",
            "Brasil",
            "Brunéi",
            "Bulgaria",
            "Burkina Faso",
            "Burundi",
            "Cabo Verde",
            "Camboya",
            "Camerún",
            "Canadá",
            "Chad",
            "Chile",
            "China",
            "Chipre",
            "Ciudad del Vaticano",
            "Colombia",
            "Comoras",
            "Congo",
            "Congo",
            "Corea del Norte",
            "Corea del Sur",
            "Costa de Marfil",
            "Costa Rica",
            "Croacia",
            "Cuba",
            "Dinamarca",
            "Dominica",
            "Ecuador",
            "Egipto",
            "El Salvador",
            "Emiratos Árabes Unidos",
            "Eritrea",
            "Eslovaquia",
            "Eslovenia",
            "España",
            "Estados Unidos",
            "Estonia",
            "Etiopía",
            "Filipinas",
            "Finlandia",
            "Fiyi",
            "Francia",
            "Gabón",
            "Gambia",
            "Georgia",
            "Ghana",
            "Gibraltar",
            "Granada",
            "Grecia",
            "Groenlandia",
            "Guadalupe",
            "Guam",
            "Guatemala",
            "Guayana Francesa",
            "Guernsey",
            "Guinea",
            "Guinea Ecuatorial",
            "Guinea-Bissau",
            "Guyana",
            "Haití",
            "Honduras",
            "Hong kong",
            "Hungría",
            "India",
            "Indonesia",
            "Irán",
            "Irak",
            "Irlanda",
            "Isla Bouvet",
            "Isla de Man",
            "Isla de Navidad",
            "Isla Norfolk",
            "Islandia",
            "Islas Bermudas",
            "Islas Caimán",
            "Islas Cocos (Keeling)",
            "Islas Cook",
            "Islas de Åland",
            "Islas Feroe",
            "Islas Georgias del Sur y Sandwich del Sur",
            "Islas Heard y McDonald",
            "Islas Maldivas",
            "Islas Malvinas",
            "Islas Marianas del Norte",
            "Islas Marshall",
            "Islas Pitcairn",
            "Islas Salomón",
            "Islas Turcas y Caicos",
            "Islas Ultramarinas Menores de Estados Unidos",
            "Islas Vírgenes Británicas",
            "Islas Vírgenes de los Estados Unidos",
            "Israel",
            "Italia",
            "Jamaica",
            "Japón",
            "Jersey",
            "Jordania",
            "Kazajistán",
            "Kenia",
            "Kirgizstán",
            "Kiribati",
            "Kuwait",
            "Líbano",
            "Laos",
            "Lesoto",
            "Letonia",
            "Liberia",
            "Libia",
            "Liechtenstein",
            "Lituania",
            "Luxemburgo",
            "Mexico",
            "Mónaco",
            "Macao",
            "Macedônia",
            "Madagascar",
            "Malasia",
            "Malawi",
            "Mali",
            "Malta",
            "Marruecos",
            "Martinica",
            "Mauricio",
            "Mauritania",
            "Mayotte",
            "Micronesia",
            "Moldavia",
            "Mongolia",
            "Montenegro",
            "Montserrat",
            "Mozambique",
            "Namibia",
            "Nauru",
            "Nepal",
            "Nicaragua",
            "Niger",
            "Nigeria",
            "Niue",
            "Noruega",
            "Nueva Caledonia",
            "Nueva Zelanda",
            "Omán",
            "Países Bajos",
            "Pakistán",
            "Palau",
            "Palestina",
            "Panamá",
            "Papúa Nueva Guinea",
            "Paraguay",
            "Perú",
            "Polinesia Francesa",
            "Polonia",
            "Portugal",
            "Puerto Rico",
            "Qatar",
            "Reino Unido",
            "República Centroafricana",
            "República Checa",
            "República Dominicana",
            "Reunión",
            "Ruanda",
            "Rumanía",
            "Rusia",
            "Sahara Occidental",
            "Samoa",
            "Samoa Americana",
            "San Bartolomé",
            "San Cristóbal y Nieves",
            "San Marino",
            "San Martín (Francia)",
            "San Pedro y Miquelón",
            "San Vicente y las Granadinas",
            "Santa Elena",
            "Santa Lucía",
            "Santo Tomé y Príncipe",
            "Senegal",
            "Serbia",
            "Seychelles",
            "Sierra Leona",
            "Singapur",
            "Siria",
            "Somalia",
            "Sri lanka",
            "Sudáfrica",
            "Sudán",
            "Suecia",
            "Suiza",
            "Surinám",
            "Svalbard y Jan Mayen",
            "Swazilandia",
            "Tadjikistán",
            "Tailandia",
            "Taiwán",
            "Tanzania",
            "Territorio Británico del Océano Índico",
            "Territorios Australes y Antárticas Franceses",
            "Timor Oriental",
            "Togo",
            "Tokelau",
            "Tonga",
            "Trinidad y Tobago",
            "Tunez",
            "Turkmenistán",
            "Turquía",
            "Tuvalu",
            "Ucrania",
            "Uganda",
            "Uruguay",
            "Uzbekistán",
            "Vanuatu",
            "Venezuela",
            "Vietnam",
            "Wallis y Futuna",
            "Yemen",
            "Yibuti",
            "Zambia",
            "Zimbabue"
    };
    private static String[] SHORTNAMES = new String[]{"AFG",
            "ALB",
            "DEU",
            "DZA",
            "AND",
            "AGO",
            "AIA",
            "ATA",
            "ATG",
            "ANT",
            "SAU",
            "ARG",
            "ARM",
            "ABW",
            "AUS",
            "AUT",
            "AZE",
            "BEL",
            "BHS",
            "BHR",
            "BGD",
            "BRB",
            "BLZ",
            "BEN",
            "BTN",
            "BLR",
            "MMR",
            "BOL",
            "BIH",
            "BWA",
            "BRA",
            "BRN",
            "BGR",
            "BFA",
            "BDI",
            "CPV",
            "KHM",
            "CMR",
            "CAN",
            "TCD",
            "CHL",
            "CHN",
            "CYP",
            "VAT",
            "COL",
            "COM",
            "COG",
            "COD",
            "PRK",
            "KOR",
            "CIV",
            "CRI",
            "HRV",
            "CUB",
            "DNK",
            "DMA",
            "ECU",
            "EGY",
            "SLV",
            "ARE",
            "ERI",
            "SVK",
            "SVN",
            "ESP",
            "USA",
            "EST",
            "ETH",
            "PHL",
            "FIN",
            "FJI",
            "FRA",
            "GAB",
            "GMB",
            "GEO",
            "GHA",
            "GIB",
            "GRD",
            "GRC",
            "GRL",
            "GLP",
            "GUM",
            "GTM",
            "GUF",
            "GGY",
            "GIN",
            "GNQ",
            "GNB",
            "GUY",
            "HTI",
            "HND",
            "HKG",
            "HUN",
            "IND",
            "IDN",
            "IRN",
            "IRQ",
            "IRL",
            "BVT",
            "IMN",
            "CXR",
            "NFK",
            "ISL",
            "BMU",
            "CYM",
            "CCK",
            "COK",
            "ALA",
            "FRO",
            "SGS",
            "HMD",
            "MDV",
            "FLK",
            "MNP",
            "MHL",
            "PCN",
            "SLB",
            "TCA",
            "UMI",
            "VG",
            "VIR",
            "ISR",
            "ITA",
            "JAM",
            "JPN",
            "JEY",
            "JOR",
            "KAZ",
            "KEN",
            "KGZ",
            "KIR",
            "KWT",
            "LBN",
            "LAO",
            "LSO",
            "LVA",
            "LBR",
            "LBY",
            "LIE",
            "LTU",
            "LUX",
            "MEX",
            "MCO",
            "MAC",
            "MKD",
            "MDG",
            "MYS",
            "MWI",
            "MLI",
            "MLT",
            "MAR",
            "MTQ",
            "MUS",
            "MRT",
            "MYT",
            "FSM",
            "MDA",
            "MNG",
            "MNE",
            "MSR",
            "MOZ",
            "NAM",
            "NRU",
            "NPL",
            "NIC",
            "NER",
            "NGA",
            "NIU",
            "NOR",
            "NCL",
            "NZL",
            "OMN",
            "NLD",
            "PAK",
            "PLW",
            "PSE",
            "PAN",
            "PNG",
            "PRY",
            "PER",
            "PYF",
            "POL",
            "PRT",
            "PRI",
            "QAT",
            "GBR",
            "CAF",
            "CZE",
            "DOM",
            "REU",
            "RWA",
            "ROU",
            "RUS",
            "ESH",
            "WSM",
            "ASM",
            "BLM",
            "KNA",
            "SMR",
            "MAF",
            "SPM",
            "VCT",
            "SHN",
            "LCA",
            "STP",
            "SEN",
            "SRB",
            "SYC",
            "SLE",
            "SGP",
            "SYR",
            "SOM",
            "LKA",
            "ZAF",
            "SDN",
            "SWE",
            "CHE",
            "SUR",
            "SJM",
            "SWZ",
            "TJK",
            "THA",
            "TWN",
            "TZA",
            "IOT",
            "ATF",
            "TLS",
            "TGO",
            "TKL",
            "TON",
            "TTO",
            "TUN",
            "TKM",
            "TUR",
            "TUV",
            "UKR",
            "UGA",
            "URY",
            "UZB",
            "VUT",
            "VEN",
            "VNM",
            "WLF",
            "YEM",
            "DJI",
            "ZMB",
            "ZWE"
    };
    private static String[] PREFFIXES = new String[] {
            "93",
            "355",
            "49",
            "213",
            "376",
            "244",
            "1 264",
            "672",
            "1 268",
            "599",
            "966",
            "54",
            "374",
            "297",
            "61",
            "43",
            "994",
            "32",
            "1 242",
            "973",
            "880",
            "1 246",
            "501",
            "229",
            "975",
            "375",
            "95",
            "591",
            "387",
            "267",
            "55",
            "673",
            "359",
            "226",
            "257",
            "238",
            "855",
            "237",
            "1",
            "235",
            "56",
            "86",
            "357",
            "39",
            "57",
            "269",
            "242",
            "243",
            "850",
            "82",
            "225",
            "506",
            "385",
            "53",
            "45",
            "1 767",
            "593",
            "20",
            "503",
            "971",
            "291",
            "421",
            "386",
            "34",
            "1",
            "372",
            "251",
            "63",
            "358",
            "679",
            "33",
            "241",
            "220",
            "995",
            "233",
            "350",
            "1 473",
            "30",
            "299",
            "",
            "1 671",
            "502",
            "",
            "",
            "224",
            "240",
            "245",
            "592",
            "509",
            "504",
            "852",
            "36",
            "91",
            "62",
            "98",
            "964",
            "353",
            "",
            "44",
            "61",
            "",
            "354",
            "1 441",
            "1 345",
            "61",
            "682",
            "",
            "298",
            "",
            "",
            "960",
            "500",
            "1 670",
            "692",
            "870",
            "677",
            "1 649",
            "",
            "1 284",
            "1 340",
            "972",
            "39",
            "1 876",
            "81",
            "",
            "962",
            "7",
            "254",
            "996",
            "686",
            "965",
            "961",
            "856",
            "266",
            "371",
            "231",
            "218",
            "423",
            "370",
            "352",
            "52",
            "377",
            "853",
            "389",
            "261",
            "60",
            "265",
            "223",
            "356",
            "212",
            "",
            "230",
            "222",
            "262",
            "691",
            "373",
            "976",
            "382",
            "1 664",
            "258",
            "264",
            "674",
            "977",
            "505",
            "227",
            "234",
            "683",
            "47",
            "687",
            "64",
            "968",
            "31",
            "92",
            "680",
            "",
            "507",
            "675",
            "595",
            "51",
            "689",
            "48",
            "351",
            "1",
            "974",
            "44",
            "236",
            "420",
            "1 809",
            "",
            "250",
            "40",
            "7",
            "",
            "685",
            "1 684",
            "590",
            "1 869",
            "378",
            "1 599",
            "508",
            "1 784",
            "290",
            "1 758",
            "239",
            "221",
            "381",
            "248",
            "232",
            "65",
            "963",
            "252",
            "94",
            "27",
            "249",
            "46",
            "41",
            "597",
            "",
            "268",
            "992",
            "66",
            "886",
            "255",
            "",
            "",
            "670",
            "228",
            "690",
            "676",
            "1 868",
            "216",
            "993",
            "90",
            "688",
            "380",
            "256",
            "598",
            "998",
            "678",
            "58",
            "84",
            "681",
            "967",
            "253",
            "260",
            "263"
    };

    public static String[] findCountryByName(String name) {
        try {
            for (int i = 0; i < 246; i++) {
                if (NAMES[i].toLowerCase().equals(name.toLowerCase().trim())) {
                    // El pais pasado por parametro
                    return new String[]{NAMES[i], PREFFIXES[i], SHORTNAMES[i]};
                }
            }
            return null;
        } catch (NullPointerException e) {
            return null;
        }
    }
}
