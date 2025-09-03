# 04-profiles-db
Build with profiles:  
- `mvn clean package -Pdev`  
- `mvn clean package -Pqa`  
- `mvn clean package -Pprod`
Run: `java -cp target/profiles-db-1.0.0.jar com.example.conf.ShowConfig`
