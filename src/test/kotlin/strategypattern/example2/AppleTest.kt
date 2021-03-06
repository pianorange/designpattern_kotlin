package strategypattern.example2

import org.jboss.arquillian.container.test.api.Deployment
import org.jboss.arquillian.junit.Arquillian
import org.jboss.shrinkwrap.api.ShrinkWrap
import org.jboss.shrinkwrap.api.asset.EmptyAsset
import org.jboss.shrinkwrap.api.spec.JavaArchive
import org.junit.runner.RunWith

import org.junit.Assert.*

@RunWith(Arquillian::class)
object AppleTest {
    @Deployment
    fun createDeployment(): JavaArchive {
        return ShrinkWrap.create(JavaArchive::class.java)
                .addClass(Apple::class.java)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml")
    }

}
