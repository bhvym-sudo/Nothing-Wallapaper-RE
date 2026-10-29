.class public final LP6/a$d;
.super LP6/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation


# instance fields
.field private final r:Le3/n0;

.field final synthetic s:LP6/a;


# direct methods
.method public constructor <init>(LP6/a;Le3/n0;)V
    .registers 5

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LP6/a$d;->s:LP6/a;

    invoke-virtual {p2}, Landroidx/databinding/g;->o()Landroid/view/View;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, v0}, LP6/a$a;-><init>(LP6/a;Landroid/view/View;)V

    iput-object p2, p0, LP6/a$d;->r:Le3/n0;

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Integer;I)V
    .registers 6

    iget-object v0, p0, LP6/a$d;->r:Le3/n0;

    iget-object v0, v0, Le3/n0;->x:Lcom/nothing/wallpaper/widget/RoundFWDRFrameLayout;

    iget-object v1, p0, LP6/a$d;->s:LP6/a;

    invoke-static {v1}, LP6/a;->d(LP6/a;)Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f13010d

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 p2, p2, 0x1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    if-eqz p1, :cond_32

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object p0, p0, LP6/a$d;->r:Le3/n0;

    iget-object p0, p0, Le3/n0;->v:Landroid/widget/ImageView;

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_32
    return-void
.end method
