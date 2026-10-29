.class final Lcom/nothing/cardwidget/mediaplayer/utils/BitmapUtil$getAvailableBitmap$1;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/cardwidget/mediaplayer/utils/BitmapUtil;->getAvailableBitmap(Landroid/content/Context;Ljava/util/List;Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "com.nothing.cardwidget.mediaplayer.utils.BitmapUtil"
    f = "BitmapUtil.kt"
    l = {
        0x56
    }
    m = "getAvailableBitmap"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcom/nothing/cardwidget/mediaplayer/utils/BitmapUtil;


# direct methods
.method constructor <init>(Lcom/nothing/cardwidget/mediaplayer/utils/BitmapUtil;Lm8/e;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nothing/cardwidget/mediaplayer/utils/BitmapUtil;",
            "Lm8/e<",
            "-",
            "Lcom/nothing/cardwidget/mediaplayer/utils/BitmapUtil$getAvailableBitmap$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/utils/BitmapUtil$getAvailableBitmap$1;->this$0:Lcom/nothing/cardwidget/mediaplayer/utils/BitmapUtil;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lm8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iput-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/utils/BitmapUtil$getAvailableBitmap$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcom/nothing/cardwidget/mediaplayer/utils/BitmapUtil$getAvailableBitmap$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/nothing/cardwidget/mediaplayer/utils/BitmapUtil$getAvailableBitmap$1;->label:I

    iget-object p1, p0, Lcom/nothing/cardwidget/mediaplayer/utils/BitmapUtil$getAvailableBitmap$1;->this$0:Lcom/nothing/cardwidget/mediaplayer/utils/BitmapUtil;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lcom/nothing/cardwidget/mediaplayer/utils/BitmapUtil;->getAvailableBitmap(Landroid/content/Context;Ljava/util/List;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
