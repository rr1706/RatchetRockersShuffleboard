package frc.rr1706

import edu.wpi.first.shuffleboard.api.plugin.*
import edu.wpi.first.shuffleboard.api.theme.Theme

import java.util.*

//@Requires (group = "edu.wpi.first.shuffleboard", name = "Base", minVersion = "1.3.0")
@Description(group = "frc.rr1706", name = "RatchetTheme", version = "0.0.1", summary = "Ratchet Rockers Shuffleboard theme as a plugin")
class RatchetTheme : Plugin {
    private val m_customTheme: Theme = Theme(getClass(), "Ratchet", "Ratchet.css")

    override fun getThemes(): List<Theme>{
        return List.of(m_customTheme)
    }
}
