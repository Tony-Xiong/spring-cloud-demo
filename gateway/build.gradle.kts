dependencyManagement {
    imports {
        mavenBom ("org.springframework.cloud:spring-cloud-dependencies:${ext["springCloudVersion"]}")
    }
}
project.dependencies
dependencies {
    implementation ("org.springframework.boot:spring-boot-starter-webflux")
    implementation ("org.springframework.cloud:spring-cloud-starter-gateway")
    implementation ("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")
}
