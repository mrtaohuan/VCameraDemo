package com.yixia.camera.demo.ui.record.adapter;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.yixia.camera.demo.R;
import com.yixia.camera.demo.ui.record.ImportVideoFolderActivity.VideoFolder;
import com.yixia.camera.demo.util.ViewHolderUtils;
import com.yixia.weibo.sdk.util.StringUtils;

public class ImportVideoFolderAdapter extends BaseAdapter {
	
	private Context mContext;
	private List<VideoFolder> videoFolderList;

	public ImportVideoFolderAdapter(Context context) {
		this.mContext = context;
		videoFolderList = new ArrayList<VideoFolder>();
	}
	
	public void updateVideoFolderData(List<VideoFolder> result){
		this.videoFolderList = result;
		this.notifyDataSetChanged();
	}
	
	@Override
	public int getCount() {
		return videoFolderList.size();
	}

	@Override
	public Object getItem(int position) {
		return videoFolderList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			convertView = LayoutInflater.from(mContext).inflate(R.layout.list_item_import_image_folder, null);
		}

		final VideoFolder item = (VideoFolder) getItem(position);
		ImageView icon = ViewHolderUtils.getView(convertView, R.id.icon);
		TextView title = ViewHolderUtils.getView(convertView, R.id.title);
		TextView count = ViewHolderUtils.getView(convertView, R.id.count);

		if (StringUtils.isNotEmpty(item.url)) {
			if (item.faild) {

			} else {
//				if (isAdded()) {
//					mImportHelper.loadVideoThumb(getActivity(), mThumbCacheDir, icon, item.video);// (getActivity(),
//					// mThumbCacheDir,
//					// mImageFetcher,
//					// icon,
//					// item);
//				}
			}
		}
		icon.setTag(item);

		title.setText(item.name);// + "\n" + item.path);//
		count.setText(item.count + "");

		return convertView;
	}

}
