package seguridad3

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class PersonaServiceSpec extends Specification {

    PersonaService personaService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Persona(...).save(flush: true, failOnError: true)
        //new Persona(...).save(flush: true, failOnError: true)
        //Persona persona = new Persona(...).save(flush: true, failOnError: true)
        //new Persona(...).save(flush: true, failOnError: true)
        //new Persona(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //persona.id
    }

    void "test get"() {
        setupData()

        expect:
        personaService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Persona> personaList = personaService.list(max: 2, offset: 2)

        then:
        personaList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        personaService.count() == 5
    }

    void "test delete"() {
        Long personaId = setupData()

        expect:
        personaService.count() == 5

        when:
        personaService.delete(personaId)
        sessionFactory.currentSession.flush()

        then:
        personaService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Persona persona = new Persona()
        personaService.save(persona)

        then:
        persona.id != null
    }
}
