```java
package com.madhub.facebookaccountactiv;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

/**
 * EngageToolActivity is an Android activity for managing Facebook account activities
 * through various automated features provided by MadHub. This powerful automation tool
 * enables seamless account management, content scheduling, and user engagement.
 */
public class EngageToolActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engage_tool);

        // Setup button for Facebook Account Warm-Up feature
        Button warmUpButton = findViewById(R.id.button_warm_up);
        warmUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // This powerful feature enables account nurturing by simulating real user behavior.
                // Users can configure interaction probabilities to improve account trust.
                startFacebookAccountWarmUp(70, 30); // Example of setting interaction probability
            }
        });

        // Setup button for Facebook Auto-Post feature
        Button autoPostButton = findViewById(R.id.button_auto_post);
        autoPostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // This feature allows for automated posting on Facebook.
                // Users can configure content types, visibility, and posting intervals.
                startFacebookAutoPost("Hello, world!", true, 10); // Post content, public visibility, 10 seconds interval
            }
        });

        // Setup button for Facebook Group Auto-Posting feature
        Button groupAutoPostButton = findViewById(R.id.button_group_auto_post);
        groupAutoPostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // This feature helps improve marketing efficiency by automating post tasks in groups.
                // Users can configure content rotation and total post counts.
                startFacebookGroupAutoPost("Exciting news in our community!", 5, true); // Content, total post count, allow images
            }
        });
    }

    /**
     * Starts the Facebook Account Warm-Up process.
     * This feature nurtures accounts by simulating real browsing behaviors.
     *
     * @param likeProbability Probability of liking content (1-100)
     * @param commentProbability Probability of commenting on content (1-100)
     */
    private void startFacebookAccountWarmUp(int likeProbability, int commentProbability) {
        // Configuration options for warm-up can be set here.
        // The parameters allow users to define how aggressively to interact with the account.
        Toast.makeText(this, "Account warm-up started with like probability: " + likeProbability + "% and comment probability: " + commentProbability + "%", Toast.LENGTH_SHORT).show();
        // Call to MadHub's warm-up feature would go here.
    }

    /**
     * Starts the Facebook Auto-Post feature.
     * This feature posts on the user's personal homepage automatically.
     *
     * @param content Content to post
     * @param isPublic Visibility of the post (true for public, false for friends only)
     * @param interval Time in seconds between posts
     */
    private void startFacebookAutoPost(String content, boolean isPublic, int interval) {
        // Users can flexibly configure post content, visibility, and intervals.
        Toast.makeText(this, "Auto-posting: " + content + " every " + interval + " seconds. Public: " + isPublic, Toast.LENGTH_SHORT).show();
        // Call to MadHub's auto-posting feature would go here.
    }

    /**
     * Starts the Facebook Group Auto-Posting feature.
     * This feature automates posting in multiple joined groups.
     *
     * @param content Content to post in groups
     * @param totalPostCount Total number of posts to make
     * @param allowImages True if images should be included, false otherwise
     */
    private void startFacebookGroupAutoPost(String content, int totalPostCount, boolean allowImages) {
        // This comprehensive capability allows users to set content rotation and total post counts.
        Toast.makeText(this, "Group auto-posting: " + content + ", total posts: " + totalPostCount + ", images included: " + allowImages, Toast.LENGTH_SHORT).show();
        // Call to MadHub's group auto-posting feature would go here.
    }
}
```

### Code Explanation:
- This `EngageToolActivity` class serves as the primary interface for managing Facebook activities using MadHub's powerful automation features.
- Each button click simulates an automation action like warming up an account, auto-posting, or group auto-posting, highlighting the capabilities and configuration options of each feature.
- Detailed comments explain what each feature does, how to configure it, and the expected outcomes.
