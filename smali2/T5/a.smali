.class public final LT5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/launcher3/dragndrop/a$b;


# instance fields
.field private final q:Lcom/android/launcher3/views/f;


# direct methods
.method public constructor <init>(Lcom/android/launcher3/views/f;)V
    .registers 3

    const-string v0, "activityContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT5/a;->q:Lcom/android/launcher3/views/f;

    return-void
.end method


# virtual methods
.method public n(Lcom/android/launcher3/h$a;Lz2/e;)V
    .registers 3

    iget-object p0, p0, LT5/a;->q:Lcom/android/launcher3/views/f;

    invoke-interface {p0}, Lcom/android/launcher3/views/f;->R()Lcom/nothing/launcher/card/p;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/nothing/launcher/card/p;->y0(F)V

    return-void
.end method

.method public t()V
    .registers 3

    iget-object v0, p0, LT5/a;->q:Lcom/android/launcher3/views/f;

    invoke-interface {v0}, Lcom/android/launcher3/views/f;->R()Lcom/nothing/launcher/card/p;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lcom/nothing/launcher/card/p;->y0(F)V

    iget-object v0, p0, LT5/a;->q:Lcom/android/launcher3/views/f;

    invoke-interface {v0}, Lcom/android/launcher3/views/f;->p()Lcom/android/launcher3/dragndrop/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/android/launcher3/dragndrop/a;->A(Lcom/android/launcher3/dragndrop/a$b;)V

    return-void
.end method
