.class public final synthetic LF7/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:LF7/j$a;

.field public final synthetic r:LC7/a;


# direct methods
.method public synthetic constructor <init>(LF7/j$a;LC7/a;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF7/h;->q:LF7/j$a;

    iput-object p2, p0, LF7/h;->r:LC7/a;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 3

    iget-object v0, p0, LF7/h;->q:LF7/j$a;

    iget-object p0, p0, LF7/h;->r:LC7/a;

    invoke-static {v0, p0, p1}, LF7/j$a;->d(LF7/j$a;LC7/a;Landroid/view/View;)V

    return-void
.end method
