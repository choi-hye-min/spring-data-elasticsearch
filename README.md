# SpringBoot + Elasticsearch v6.5.2
![Alt text](https://monosnap.com/image/JLOMgNu0PYui3ztj3MIZvXmieRV9X8.png)

![Alt text](https://monosnap.com/image/E2WN09D4YBux4ZlzXG7PFsPnwXnH4R.png)

- GET /hotels/_mapping
```json
{
  "hotels" : {
    "mappings" : {
      "hotel" : {
        "properties" : {
          "address" : {
            "type" : "text",
            "fields" : {
              "keyword" : {
                "type" : "keyword",
                "ignore_above" : 256
              }
            }
          },
          "checkin" : {
            "type" : "date"
          },
          "city" : {
            "type" : "text",
            "fields" : {
              "keyword" : {
                "type" : "keyword",
                "ignore_above" : 256
              }
            }
          },
          "internet" : {
            "type" : "boolean"
          },
          "location" : {
            "properties" : {
              "lat" : {
                "type" : "float"
              },
              "lon" : {
                "type" : "float"
              }
            }
          },
          "name" : {
            "type" : "text",
            "fields" : {
              "keyword" : {
                "type" : "keyword",
                "ignore_above" : 256
              }
            }
          },
          "price" : {
            "type" : "long"
          },
          "rooms" : {
            "type" : "long"
          },
          "service" : {
            "type" : "text",
            "fields" : {
              "keyword" : {
                "type" : "keyword",
                "ignore_above" : 256
              }
            }
          },
          "stars" : {
            "type" : "long"
          }
        }
      }
    }
  }
}
```