grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"

grails.project.fork = [
        // configure settings for compilation JVM, note that if you alter the Groovy version forked compilation is required
        //  compile: [maxMemory: 256, minMemory: 64, debug: false, maxPerm: 256, daemon:true],

        // configure settings for the test-app JVM, uses the daemon by default
        test   : [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256, daemon: true],
        // configure settings for the run-app JVM
        run    : [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256, forkReserve: false],
        // configure settings for the run-war JVM
        war    : [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256, forkReserve: false],
        // configure settings for the Console UI JVM
        console: [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256]
]

grails.project.dependency.resolver = "maven" // or ivy
grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // uncomment to disable ehcache
        // excludes 'ehcache'
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    repositories {
        grailsCentral()
        mavenLocal()
        mavenCentral()
        mavenRepo("http://repo.dev.outfittery.de/plugins-snapshot-local") { updatePolicy = 'always' }
        mavenRepo("http://repo.dev.outfittery.de/plugins-release-local")
    }

    dependencies {
        compile "com.fasterxml.jackson.core:jackson-core:2.5.1"
        compile "com.fasterxml.jackson.core:jackson-annotations:2.5.1"
        compile "com.fasterxml.jackson.core:jackson-databind:2.5.1"
        compile "org.codehaus.jackson:jackson-mapper-asl:1.9.13"
    }

    plugins {
        compile ":spring-social-core:0.2.0"

        build(":release:3.0.1",
                ":rest-client-builder:1.0.3") {
            export = false
        }
    }
}

//grails.plugin.location.'springsocial-core' = "../grails-spring-social-core"
