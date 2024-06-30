package com.example.auto

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.auto.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private var startButton: Button? = null
    private var sendNumber: EditText? = null

    private var viewBinding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding?.root)
        initViews()
    }

    private fun initViews() {
        viewBinding?.let { binding ->
            binding.startButton.setOnClickListener {
                start(binding.numberEditText.text.toString().toInt())
            }
        }
    }

    private fun start(count: Int) {
        val lap: ArrayList<Transport> = ArrayList()
        for (i in 1..count)
            lap.add(TranportCreator.createRandomTranport())
        race(lap)
    }

    private fun race(lap: ArrayList<Transport>) {
        if (lap.size == 2) {
            println("Гонка между ${lap[0].modelName} и ${lap[1].modelName}, " +
                    "Победитель ${faster(lap[0], lap[1]).modelName}")
        } else {
            val newLap = ArrayList<Transport>()
            while (lap.size > 1) {
                val t1 = lap.removeAt(Random.nextInt(0, lap.size))
                val t2 = lap.removeAt(Random.nextInt(0, lap.size))
                newLap.add(faster(t1, t2))
                println("Гонка между ${t1.modelName} и ${t2.modelName}, " +
                        "Победитель ${faster(t1, t2).modelName}")
                if (lap.size == 1) {
                    println("${lap[0].modelName} - Нет пары, следующий круг")
                    newLap.add(lap.removeAt(0))
                }
            }
            return race(newLap)
        }
    }

    private fun faster(t1: Transport, t2: Transport): Transport = if (t1.maxSpeed >= t2.maxSpeed) t1 else t2

}