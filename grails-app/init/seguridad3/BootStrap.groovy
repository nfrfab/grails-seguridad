package seguridad3

import myapp.Role
import myapp.User
import myapp.UserRole

class BootStrap {

    def init = { servletContext ->
        def adminRole = new Role(authority: "ROLE_ADMIN").save()
        def userRole = new Role(authority: "ROLE_USER").save()
        
        def admin = new User(username: "admin", password: "admin").save()
        def user = new User(username: "user", password: "user").save()
        
        UserRole.create admin, adminRole
        UserRole.create user, userRole
        
        UserRole.withSession {
            it.flush()
            it.clear()
        }
        
    }
    def destroy = {
    }
}
