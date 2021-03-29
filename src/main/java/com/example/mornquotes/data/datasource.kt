package com.example.mornquotes.data

import com.example.mornquotes.R
import com.example.mornquotes.model.MornQuotes


class Datasource
{
    fun loadquotes(): List<MornQuotes>
    {
        return listOf<MornQuotes>(
            MornQuotes(R.string.affirmation1,R.drawable.image1),
            MornQuotes(R.string.affirmation2,R.drawable.image2),
            MornQuotes(R.string.affirmation3,R.drawable.image3),
            MornQuotes(R.string.affirmation4,R.drawable.image4),
            MornQuotes(R.string.affirmation5,R.drawable.image5),
            MornQuotes(R.string.affirmation6,R.drawable.image6),
            MornQuotes(R.string.affirmation7,R.drawable.image7),
            MornQuotes(R.string.affirmation8,R.drawable.image8),
            MornQuotes(R.string.affirmation9,R.drawable.image9),
            MornQuotes(R.string.affirmation10,R.drawable.image10)
        )

    }

}