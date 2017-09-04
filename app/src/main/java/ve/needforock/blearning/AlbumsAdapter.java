package ve.needforock.blearning;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.Query;


/**
 * Created by Soporte on 04-Sep-17.
 */

public class AlbumsAdapter extends FirebaseRecyclerAdapter<Album, AlbumsAdapter.AlbumHolder>{



    public AlbumsAdapter(Query ref) {
        super(Album.class, R.layout.list_item_album, AlbumHolder.class, ref);
    }

    @Override
    protected void populateViewHolder(AlbumHolder viewHolder, Album model, int position) {
        viewHolder.name.setText(model.getName());
        viewHolder.release.setText(String.valueOf(model.getRelease()));
        viewHolder.band.setText(model.getBand());

    }

    public static class AlbumHolder extends RecyclerView.ViewHolder {

        private TextView name, band, release;

        public AlbumHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.nameTv);
            band = (TextView) itemView.findViewById(R.id.bandTv);
            release = (TextView) itemView.findViewById(R.id.releaseTv);
        }
    }
}
