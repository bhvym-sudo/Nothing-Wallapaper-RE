.class public final synthetic LM6/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:Lv8/p;

.field public final synthetic r:LM6/u;


# direct methods
.method public synthetic constructor <init>(Lv8/p;LM6/u;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM6/p;->q:Lv8/p;

    iput-object p2, p0, LM6/p;->r:LM6/u;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 3

    iget-object v0, p0, LM6/p;->q:Lv8/p;

    iget-object p0, p0, LM6/p;->r:LM6/u;

    invoke-static {v0, p0, p1}, LM6/u;->h(Lv8/p;LM6/u;Landroid/view/View;)V

    return-void
.end method
