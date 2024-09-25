package com.example.ass1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.ass1.data.FourthScreenListDVO
import com.example.ass1.ui.screens.FourthScreen
import com.example.ass1.ui.theme.ProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProjectTheme {
                FourthScreen(
                    data = listOf(
                        FourthScreenListDVO(
                            image = R.drawable.nfts,
                            type = "NFTs",
                            title = "Minting Your First NFT: A Beginner’s Guide to Creating...",
                            createdAt = "15m ago"
                        ),
                        FourthScreenListDVO(
                            image = R.drawable.business,
                            type = "Business",
                            title = "5 things to know before the stock market opens Monday",
                            createdAt = "1h ago"
                        ),
                        FourthScreenListDVO(
                            image = R.drawable.travel,
                            type = "Travel",
                            title = "Bali plans to reopen to international tourists in Septe...",
                            createdAt = "1w ago"
                        ),
                        FourthScreenListDVO(
                            image = R.drawable.health,
                            type = "Health",
                            title = "Healthy Living: Diet and Exercise Tips & Tools for Success.",
                            createdAt = "4h ago"
                        ),
                    )
                )
            }
        }
    }
}
