package org.team1540.timeclock.backend.interfaces

import org.team1540.timeclock.backend.services.ClockInOutException

interface HoursTracker {
    /**
     * Record a user with id [id] clocking in at [timeMs] milliseconds after the Unix epoch.
     *
     * @throws org.team1540.timeclock.backend.services.UserNotFoundException if the user does not exist
     * @throws org.team1540.timeclock.backend.services.AlreadyClockedInOrOutException if the user has already clocked in without clocking out
     */
    @Throws(ClockInOutException::class)
    fun recordClockIn(id: String, timeMs: Long)

    /**
     * Record a user with id [id] clocking in at [timeMs] milliseconds after the Unix epoch.
     *
     * @throws UserNotFoundException if the user does not exist.
     * @throws AlreadyClockedInOrOutException if the user has already clocked out without clocking in again
     * @throws NeverClockedInException if the user has never clocked in
     */
    @Throws(ClockInOutException::class)
    fun recordClockOut(id: String, timeMs: Long)
}
