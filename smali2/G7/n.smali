.class public final LG7/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LG7/n;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LG7/n;

    invoke-direct {v0}, LG7/n;-><init>()V

    sput-object v0, LG7/n;->a:LG7/n;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;LJ7/i;LS1/a;LF8/L;)V
    .registers 11

    const-string v0, "listView"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clockViewFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LG7/n$a;

    invoke-direct {v0, p1}, LG7/n$a;-><init>(LJ7/i;)V

    invoke-virtual {p0, v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->setOnClockItemClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v4, LG7/n$b;

    const/4 v0, 0x0

    invoke-direct {v4, p1, p0, p2, v0}, LG7/n$b;-><init>(LJ7/i;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;LS1/a;Lm8/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p3

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method
