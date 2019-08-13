package `in`.antojose.swoosh.Controller

import `in`.antojose.swoosh.Model.Player
import `in`.antojose.swoosh.R
import `in`.antojose.swoosh.Utilities.EXTRA_PLAYER
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeaguesText.text = "Looking for ${player.league} ${player.skill} near you..."
    }
}
