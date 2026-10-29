.class public final synthetic LT6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:LT6/f;

.field public final synthetic r:I


# direct methods
.method public synthetic constructor <init>(LT6/f;I)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT6/c;->q:LT6/f;

    iput p2, p0, LT6/c;->r:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 3

    iget-object v0, p0, LT6/c;->q:LT6/f;

    iget p0, p0, LT6/c;->r:I

    invoke-static {v0, p0, p1}, LT6/f;->d(LT6/f;ILandroid/view/View;)V

    return-void
.end method
