.class public final synthetic LX7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:Ljava/util/List;

.field public final synthetic r:LX7/i;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;LX7/i;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX7/e;->q:Ljava/util/List;

    iput-object p2, p0, LX7/e;->r:LX7/i;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 3

    iget-object v0, p0, LX7/e;->q:Ljava/util/List;

    iget-object p0, p0, LX7/e;->r:LX7/i;

    invoke-static {v0, p0, p1}, LX7/i;->a(Ljava/util/List;LX7/i;Landroid/view/View;)V

    return-void
.end method
