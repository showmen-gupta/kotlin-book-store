package org.example.kotlinbookstore.config.flyway

import org.flywaydb.core.api.migration.BaseJavaMigration
import org.flywaydb.core.api.migration.Context
import org.springframework.stereotype.Component

@Component
class V3__Add_National_Identity_Number : BaseJavaMigration() {
    override fun migrate(context: Context) {
        val update = context.connection.createStatement()
        update.execute("""
            ALTER TABLE app_user
    ADD COLUMN national_identity NUMERIC NULL;
        """.trimIndent())
    }
}