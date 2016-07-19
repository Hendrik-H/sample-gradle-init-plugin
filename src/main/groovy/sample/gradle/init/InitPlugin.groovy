package sample.gradle.init

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.invocation.Gradle

class InitPlugin implements Plugin<Gradle> {
    void apply(Gradle gradle) {
    	System.out.println('***** Init Plugin is being applied *****')
    }
}
 
