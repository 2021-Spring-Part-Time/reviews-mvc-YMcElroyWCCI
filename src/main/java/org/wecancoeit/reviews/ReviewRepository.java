package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();
    public ReviewRepository(){
        Review cruise1 = new Review(1L, "Seven Seas Explorer by Regent Seven Seas Cruises", "./images/SevenSeasExplorer.jpg", "./flipImages/Seven.jpg","All-inclusive cruise lines",
                "Regent Seven Seas Cruises, which are owned by Norwegian Cruise Line Holdings Ltd, are all-inclusive luxury cruise line with a five-ship fleet that visits more than 450 destinations around the world. The five ships are Seven Seas Splendor, Seven Seas Explorer, Sever Seas Voyager, Sever Seas Mariner, and Seven Seas Navigator. All ships are chosen as the world's top-rate cruise line six times by the readers of Conde Nast Traveler and Travel + Leisure magazines. The ships provides a limited number of guests with the highest standard of cruising excellence combined with exciting opportunities for discovery around the world. The Seven Seas Explorer sets the bar for luxury cruising with each stunning suite has spacious closets, high-end finishes, relaxing Elite slumber beds and private balconies. As you dine on epicurean feasts, be inspired by artwork from Picasso and Chagall. The price starts from $3,599 per person based on double occupancy.");
        Review cruise2 = new Review(2L, "Viking Sky by Viking Ocean Cruises", "./images/VikingSky.jpg", "./flipImages/Viking.jpg", "All-inclusive cruise lines - adult only",
                "Viking was founded in 1997 with the purchase of four ships in Russia. Then the company purchased Europe's KD River Cruise to grow its fleet in 2000 and continued expanding into the American market. The cruise ships have been awarded the World's Best Awards 5 years in a row from 2016 to 2020 by Travel + Leisure readers. Viking Sky was introduced in 2017. The ship boasts private balconies in comfortable luxurious stateroom. The ship has fitness center, spas, destination focused lectures, two pools and whirlpools, live performances in the theater, and two cinemas. Dining choice of restaurants offering variety of fine dining options, the most alfresco dining on the Aquafit Terrace to Manfredi's Italian restaurant. This ship sails to Mediterranean, Europe, Central America, and more. The price starts from $2,799 per person based on double occupancy.");
        Review cruise3 = new Review(3L, "Seabourn Odyssey by Seabourn Cruise Line", "./images/Seabourn.jpg", "./flipImages/Seabourn.jpg","All-inclusive cruise lines",
                "The Seabourn Odyssey is a cruise ship for Seabourn Cruise Line. The ship's keel was laid in early July 2007, and when it was commissioned in 2009, it was the first new ship for Seabourn in over a decade. The ship includes 11 decks with two swimming pools, six outdoor whirlpools, a spa and a marina. The Retreat features a nine-hole mini golf course, a giant chess board and shuffleboard. The ship was completed in May 2009, a few weeks earlier than planned. A cruise that offers unique, all-inclusive, luxury cruise vacations with service consistently ranked best of the best. The price starts from $3,299 per person based on double occupancy for a luxurious suite on a 7 night cruise with luxury on World-Class Yachts. ");
        Review cruise4 = new Review(4L, "Celebrity Reflection by Celebrity Cruises", "./images/Celebrity.jpg", "./flipImages/Celebrity.jpg","Not all-inclusive cruise lines",
                "Celebrity Reflection was built in 2012 and refurbished in 2017. The cruise that makes you relax ike never before in one of the 34 new AquaClass Suites with luxurious interior space and stunning verandas. Sun lounges on the pool deck and be entertained in the theater. Excitement brews with up to 50 international craft beers in the enhanced Michael's Club. Celebrate the flavorful joys of outdoor grilling in the new Lawn Club Grill. Unwind in your own cabana-style haven, The Alcoves, on the Lawn Club. Time aboard Celebrity Reflection will make most of your precious vacation time. The lowest price starts from $299 per person based on double occupancy for a 2 night Bahamas Getaway departing from Ft. Lauderdale Port Everglades in Florida to Nassau in Bahamas with sailing date on November 11, 2020 for an interior or ocean room.");
        Review cruise5 = new Review(5L, "Crystal Symphony by Crystal Cruises", "./images/Crystal.jpg", "./flipImages/Crystal.jpg","All-inclusive cruise lines",
                "Crystal Symphony is a cruise ship owned and operated by Crystal Cruises. She was built in 1995 at Kværner Masa-Yards Turku New Shipyard, Finland. One of the most luxurious cruise ships afloat, Crystal Cruises' 848-passenger Crystal Symphony, recently emerged from a massive makeover designed to make it even more upscale. The price starts from $2,999 per person based on double occupancy.");
        Review cruise6 = new Review(6L, "Disney Magic by Disney Cruise Line", "./images/Disney.jpg", "./flipImages/Disney.jpg","All-inclusive cruise lines - Family",
                "Disney Magic is the first cruise ship owned and operated by Disney Cruise Line, a subsidiary of The Walt Disney Company. She has 11 public decks, can accommodate 2,700 passengers in 875 staterooms, and has a crew of approximately 950. The interior of Disney Magic is decorated in the Art Deco style. Disney Cruise Line offers fun-filled onboard activities for every member of the family, including karaoke, game shows and bingo. Designed with families in mind, Disney Cruise Line staterooms aboard the Disney Magic are equipped with innovations that ensure the ultimate in comfort and relaxation for Guests of all ages. It's truly a magic at Sea. The price starts from $420 per person based on double occupancy.");

        reviewsList.put(cruise1.getId(), cruise1);
        reviewsList.put(cruise2.getId(), cruise2);
        reviewsList.put(cruise3.getId(), cruise3);
        reviewsList.put(cruise4.getId(), cruise4);
        reviewsList.put(cruise5.getId(), cruise5);
        reviewsList.put(cruise6.getId(), cruise6);
    }

    public ReviewRepository(Review ...reviewsToAdd) {
        for(Review review: reviewsToAdd){
            reviewsList.put(review.getId(), review);
        }
    }

    public Review findOne(long id) {
        return reviewsList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewsList.values();
    }
}
