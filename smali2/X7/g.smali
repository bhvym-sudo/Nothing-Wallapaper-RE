.class public final synthetic LX7/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:Ljava/util/List;

.field public final synthetic r:I

.field public final synthetic s:LX7/i;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;ILX7/i;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX7/g;->q:Ljava/util/List;

    iput p2, p0, LX7/g;->r:I

    iput-object p3, p0, LX7/g;->s:LX7/i;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 4

    iget-object v0, p0, LX7/g;->q:Ljava/util/List;

    iget v1, p0, LX7/g;->r:I

    iget-object p0, p0, LX7/g;->s:LX7/i;

    invoke-static {v0, v1, p0, p1}, LX7/i;->b(Ljava/util/List;ILX7/i;Landroid/view/View;)V

    return-void
.end method
