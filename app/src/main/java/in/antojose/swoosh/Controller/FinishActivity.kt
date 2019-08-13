package `in`.antojose.swoosh.Controller

import `in`.antojose.swoosh.R
import `in`.antojose.swoosh.Utilities.EXTRA_LEAGUE
import `in`.antojose.swoosh.Utilities.EXTRA_SKILL
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesText.text = "Looking for $league $skill near you..."
    }
}
