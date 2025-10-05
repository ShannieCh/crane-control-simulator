package com.cranesim.CraneControlSim;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/crane")
public class CraneController {

    private int x = 0;
    private int y = 0;
    private boolean hasContainer = false;

    @PostMapping("/move")       // Move crane to X/Y position.
    public String move(@RequestBody MoveRequest request) {
        x = request.getNewX();
        y = request.getNewY();
        return "Crane moved to (" + x + ", " + y + ")";
    }

    @PostMapping("/pickup")    // Simulate picking up a container.
    public String pickup() {
        if (hasContainer) return "Already carrying a container!";
        hasContainer = true;
        return "Container picked up at (" + x + ", " + y + ")";
    }

    @PostMapping("/drop")     // Simulate dropping a container.
    public String drop() {
        if (!hasContainer) return "No container to drop!";
        hasContainer = false;
        return "Container dropped at (" + x + ", " + y + ")";
    }

    @GetMapping("/status")  // Show current status (position, has container or not).
    public String status() {
        return "Position: (" + x + ", " + y + "), Carrying: " + (hasContainer ? "Yes" : "No");
    }
}
